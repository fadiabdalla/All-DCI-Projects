package buffer_manipulation_exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferManipulationExercise {

	public static void main(String[] args) {

		FileInputStream file1 = null;
		FileOutputStream file2 = null;
		FileChannel sourceChannel = null;
		FileChannel destinationChannel = null;

		try {
			file1 = new FileInputStream("//home//dci-student//Desktop//source.txt");
			file2 = new FileOutputStream("//home//dci-student//Desktop//destination.txt");

			sourceChannel = file1.getChannel();
			destinationChannel = file2.getChannel();

			ByteBuffer buffer = ByteBuffer.allocate(1024);

			int bytesRead = sourceChannel.read(buffer);

			while (bytesRead != -1) {

				buffer.flip();

				destinationChannel.write(buffer);

				buffer.clear();
				bytesRead = sourceChannel.read(buffer);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			System.out.println("Completed! The file1 has been copied in the file2.");

			try {
				if (sourceChannel != null) {
					sourceChannel.close();
				}
				if (destinationChannel != null) {
					destinationChannel.close();
				}
				if (file1 != null) {
					file1.close();
				}
				if (file2 != null) {
					file2.close();
				}
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}

}
