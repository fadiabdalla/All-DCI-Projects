package sequenceinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Main {

	public static void main(String[] args) throws Exception {

		// to read more than one file in the same time.

		FileInputStream file1 = new FileInputStream("//home//dci-student//Desktop//test.txt");
		FileInputStream file2 = new FileInputStream("//home//dci-student//Desktop//test2.txt");
		FileOutputStream fileOutput = new FileOutputStream("//home//dci-student//Desktop//test3.txt");

		SequenceInputStream sis = new SequenceInputStream(file1, file2);

		int b = 0;
		while ((b = sis.read()) != -1) {
			System.out.print((char) b);
			fileOutput.write(b);

		}
         sis.close();
         file1.close();
         file2.close();
         fileOutput.close();
	}
}
