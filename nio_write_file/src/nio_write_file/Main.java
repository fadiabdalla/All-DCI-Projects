package nio_write_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

	public static void main(String[] args) throws IOException {

		// Initializing file and channel variables to null initially
        FileOutputStream file = null;
        FileChannel channel = null;

        try {
            // Creating a new FileOutputStream to write to the specified file path
            file = new FileOutputStream("//home//dci-student//Desktop//text.txt");

            // Obtaining a FileChannel from the FileOutputStream
            channel = file.getChannel();

            // Message to be written to the file
            String message = "Hello World!";
            
            // Converting the message into bytes and putting it into the ByteBuffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            byte[] messageInBytes = message.getBytes();
            buffer.put(messageInBytes);
            
            // Flipping the buffer to prepare for reading and writing the data to the channel
            buffer.flip();
            channel.write(buffer);
            
            // Clearing the buffer for potential future use
            buffer.clear();

        } catch (FileNotFoundException e) {
            // Handling FileNotFoundException and printing an error message
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handling IOException and printing an error message
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            // Code in the finally block will always execute, ensuring resources are closed
            
            // Printing a completion message
            System.out.println("Completed! The message has been written to the file.");

            // Closing the channel and file resources if they are not null
            if (channel != null) {
                channel.close();
            }
            if (file != null) {
                file.close();
            }
        }
    }
}