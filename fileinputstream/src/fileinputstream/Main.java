package fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		/*
		 * I/O Streams
		 * java.io package
		 * Java streams are composed of bytes.
		 * FileOutputStream extends OutputStream
		 * FileInputStream extends InputStream
		 * The read() method returns -1 at the end of its execution.
		 */
		try {
			FileInputStream file = new FileInputStream("//home//dci-student//Desktop//test.csv");
			/*int b = file.read();
		    System.out.println((char)b);
		    file.close(); */
			int b = 0;
			while ((b = file.read())!= -1 ) {
				System.out.print((char) b);
			}
			file.close();
		   
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
