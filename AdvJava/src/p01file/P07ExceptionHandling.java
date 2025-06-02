package p01file;
import java.io.FileReader;
import java.io.IOException;

public class P07ExceptionHandling {
    public static void main(String[] args) {
        
    	FileReader reader = null;
        try {
            reader = new FileReader("output.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) 
                	reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
