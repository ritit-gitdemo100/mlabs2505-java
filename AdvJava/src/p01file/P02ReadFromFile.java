package p01file;
import java.io.FileReader;
import java.io.IOException;

public class P02ReadFromFile {
    public static void main(String[] args) {
    	
        try {
            FileReader reader = new FileReader("output.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
