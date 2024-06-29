package writing_data_to_a_file_exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterExercise {

	static void writeNamesToFile(String[] text, String fileName) throws IOException {
		FileOutputStream file = null;
		try {

			file = new FileOutputStream("//home//dci-student//Desktop//" + fileName);

			for (String name : text) {

				byte[] OutputName = (name + "\n").getBytes();
				file.write(OutputName);

			}
		} finally {
			if (file != null) {
				file.close();
			}
		}

	}

	public static void main(String[] args) throws IOException {

		String[] names = { "Nicole", "Casie", "Charlie", "David", "Raven" };
		
		 String fileName = "names.txt";

		 try {
	            writeNamesToFile(names, fileName);
	            System.out.println("Names have been successfully written to " +
	                    fileName);
	        } catch (IOException e) {
	            System.err.println("An error occurred while writing to the file: " +
	                    e.getMessage());
	        }
	    }
	}