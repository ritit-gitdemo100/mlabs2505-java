package p01file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//BufferedWriter reduces the number of I/O operations 
//by buffering the data in memory and writing it in chunks.
//Used in Writing large amounts of data or writing in a loop.

public class P04BufferedWrite {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("buffered_output.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 1; i <= 10; i++) {
			bw.write("Line " + i);
			bw.newLine();
		}

		bw.close();
		fw.close();

		System.out.println("Written using BufferedWriter.");

	}
}
