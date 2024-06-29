package nio_file_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		try {

			FileInputStream fis = new FileInputStream("//home//dci-student//Desktop//text.txt");

			FileChannel channel = fis.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024);

			int bytesRead = channel.read(buffer);
			
			while(bytesRead != -1) {
				
				buffer.flip();
				while(buffer.hasRemaining()) {
					System.out.print((char)buffer.get());
					
				}
				buffer.clear();
				bytesRead = channel.read(buffer);
			}
			
			fis.close();
			System.out.println("completed");

		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
