package callable_and_future_exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SumMain {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		List<Future<Long>> futures = new ArrayList<>();

		SumCalculator range1 = new SumCalculator(10, 20);
		SumCalculator range2 = new SumCalculator(5, 13);
		SumCalculator range3 = new SumCalculator(23, 73);

		Future<Long> result1 = executor.submit(range1);
		Future<Long> result2 = executor.submit(range2);
		Future<Long> result3 = executor.submit(range3);

		futures.add(result1);
		futures.add(result2);
		futures.add(result3);

		for (int i = 0; i < futures.size(); i++) {
			try {
				long result = futures.get(i).get();
				System.out.println("The sum for range " + (i + 1) + ": " + result);
			} catch (Exception e) {
				e.printStackTrace();
			}

			executor.shutdown();
			try {
				executor.awaitTermination(10, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
