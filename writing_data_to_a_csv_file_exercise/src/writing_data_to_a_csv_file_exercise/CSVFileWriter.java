package writing_data_to_a_csv_file_exercise;

import java.io.FileOutputStream;
import java.io.IOException;

public class CSVFileWriter {

	// Method to write student records to a specified file
	static void writeStudentRecordsToFile(String fileName, String[][] studentRecords) throws IOException {

		// Create a FileOutputStream object
		FileOutputStream OutputStudentRecords = null;

		try {
			// Initialize the FileOutputStream object with the specified file path
			OutputStudentRecords = new FileOutputStream("//home//dci-student//Desktop//" + fileName);

			// Go through each student record
			for (int i = 0; i < studentRecords.length; i++) {
				// Go through each attribute of the student record
				for (int j = 0; j < studentRecords[i].length; j++) {
					// Convert the attribute to bytes and write it to the file
					byte[] student = (studentRecords[i][j] + ",").getBytes();
					OutputStudentRecords.write(student);
				}
				// Add a newline character after each student record
				String newLine = "\n";
				OutputStudentRecords.write(newLine.getBytes());
			}

		} finally {
			// At the end, close the FileOutputStream to release system resources
			if (OutputStudentRecords != null) {
				OutputStudentRecords.close();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// Create a two-dimensional array of student records
		String[][] studentRecords = { { "101", "Fadi", "1.5" }, { "102", "Sandy", "3.5" }, { "103", "Tony", "2" },
				{ "104", "Sarah", "4.2" } };

		String fileName = "student_records.csv";

		try {
			// Call the writeStudentRecordsToFile method to write the student records to the
			// CSV file
			writeStudentRecordsToFile("student_records.csv", studentRecords);
			System.out.println("Records have been successfully written to " + fileName);

		} catch (IOException e) {
			// If an IOException occurs during the file writing process, print an error
			// message
			System.err.println("An error occurred while writing to the file: " + e.getMessage());
		}
	}

}