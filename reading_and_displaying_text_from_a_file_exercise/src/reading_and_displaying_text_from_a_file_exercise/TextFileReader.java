package reading_and_displaying_text_from_a_file_exercise;

import java.io.FileInputStream;
import java.io.IOException;

public class TextFileReader {
	
	static void readAndDisplayFile(String fileName) throws IOException{
		
		FileInputStream file = null;
		
		try {
			
			file = new FileInputStream("//home//dci-student//Desktop//" + fileName);
			int i = 0;
			while ((i = file.read())!= -1 ) {
				System.out.print((char) i);
		}
		}finally {
			if (file != null) {
				file.close();
			}
		}
		
	}
	
	

	public static void main(String[] args) {

		
		String fileName = "text.txt";

		try {
			
			readAndDisplayFile(fileName);
			
			System.out.println("File reading was successful.");

		} catch (IOException e) {
			
			System.err.println("An error occurred while reading the file: " + e.getMessage());
		}
	}

}