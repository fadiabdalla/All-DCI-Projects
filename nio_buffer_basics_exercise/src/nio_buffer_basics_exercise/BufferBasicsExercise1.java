package nio_buffer_basics_exercise;

import java.nio.*;

public class BufferBasicsExercise1 {

	public static void main(String[] args) {

		ByteBuffer buffer =  ByteBuffer.allocate(1024);
		
		String message = "Hello World!";
		buffer.put(message.getBytes());
		buffer.flip();
		  while (buffer.hasRemaining()) {
	            System.out.print((char) buffer.get());
	        }
	}

}
