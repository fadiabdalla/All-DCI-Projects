package fixed_thread_pool_exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(4);

		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int number : numbers) {

			es.submit(new TaskProcessor(number));
		}

		es.shutdown();
		try {
			es.awaitTermination(6, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All done!");

	}

}
