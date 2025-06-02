package p01file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P05BufferedRead {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("buffered_output.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

	}
}
