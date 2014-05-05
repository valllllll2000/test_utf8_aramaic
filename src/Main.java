import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
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
