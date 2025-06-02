package p01file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P08ByteCopy {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("ice_strawberry.jpeg");
				FileOutputStream fos = new FileOutputStream("ice_new.jpeg")) {
			
			int byteData;
			while ((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}
			System.out.println("Binary file copied successfully.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
