package thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Calculations {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 1; i < 6; i++) {

			executor.submit(new Tasks(i));
		}

		executor.shutdown();
		System.out.println("Tasks are now submitted.");

		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Tasks are now finished.");

	}

}
