package p01file;
import java.io.File;
import java.io.IOException;

public class P09FileClass {
    public static void main(String[] args) {

            File file = new File("output.txt");

            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Can Read: " + file.canRead());
            System.out.println("Can Write: " + file.canWrite());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Length (bytes): " + file.length());

    }
}
