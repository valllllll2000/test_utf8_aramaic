import java.io.*;

/**
 * Created by valeria on 5/5/14.
 *
 * cd test_utf8/src
 *
 * javac -g Main.java -d ../
 *
 * cd ..
 * java Main
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("arameen"));
            File file = new File("arameen_new");
            if (!file.exists()) {
                file.createNewFile();
            }
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                bw.write(line);
                line = br.readLine();
            }
            bw.close();
            String everything = sb.toString();
            System.out.println("Read text : "+everything);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
