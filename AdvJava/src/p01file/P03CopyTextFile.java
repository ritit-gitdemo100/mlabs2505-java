package p01file;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P03CopyTextFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("output.txt");
            FileWriter writer = new FileWriter("destination.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
