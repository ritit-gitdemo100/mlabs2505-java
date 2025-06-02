package p01file;
import java.io.FileWriter;
import java.io.IOException;


public class P01WriteToFile {
    public static void main(String[] args) throws IOException  {

            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, Welcome to Java File Handling");
            writer.close();
            
            System.out.println("Successfully written to file.");

    }
}
