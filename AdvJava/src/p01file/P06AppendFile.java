package p01file;

import java.io.FileWriter;
import java.io.IOException;

public class P06AppendFile {
	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("output.txt", true)) {
			fw.write("\nAppended text.");
			System.out.println("Text appended.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
