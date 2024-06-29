package fileoutpurstream;

import java.io.FileOutputStream;

public class Main {

	/*
	 * I/O Streams
	 * java.io package
	 * Java streams are composed of bytes.
	 * FileOutputStream extends OutputStream
	 * FileIputStream extends InputStream
	 */
	
	
	public static void main(String[] args) {

		try {
			
			FileOutputStream file = new FileOutputStream("//home//dci-student//Desktop//test.csv");
			String text = "Java Course";
			byte b[] = text.getBytes();
			file.write(b);
			file.close();
			System.out.println("success!");
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

}
