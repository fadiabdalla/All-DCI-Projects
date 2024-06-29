package parallel_streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/*
 * Sequential  stream is executed in single thread.
 * Parallel stream is executed by different threads at the same time.
 * Use parallel streams only when you don't have to rely on an order.
 * 
 * Different ways to create parallel streams:
 * 1. Using the parallel() method on a stream:
 * 2. Using the parallelStream() method on a Collection.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("names.txt");
		
		Stream<String> text = Files.lines(file.toPath());
		
		text.parallel().forEach(System.out::println);

		text.close();
		
		
	}

}
