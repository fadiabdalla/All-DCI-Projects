package atomic_integer_exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Application {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(10);

		Counter counter = new Counter();

		executor.submit(counter);

		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Counter: " + counter.getCount());

	}

}
