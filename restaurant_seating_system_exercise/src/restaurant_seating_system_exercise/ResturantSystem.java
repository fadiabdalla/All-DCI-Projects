package restaurant_seating_system_exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ResturantSystem {

	public static void main(String[] args) {

		Tables tables = new Tables();
		ExecutorService executor = Executors.newFixedThreadPool(30);

		for (int n = 0; n < 20; n++) {
			executor.submit(new Customer(tables));
		}

		executor.shutdown();
		try {
			executor.awaitTermination(5, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}