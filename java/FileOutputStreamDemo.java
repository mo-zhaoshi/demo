package java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("filse01.txt");
		String str = "Hello Java!";
		byte[] bys = str.getBytes();
		file.write(bys, 0, bys.length);
		file.close();
		
		
	}
}
