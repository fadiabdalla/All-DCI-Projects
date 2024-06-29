package callable_and_future_exercise;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ExecutorService executor = Executors.newFixedThreadPool(1);

		System.out.println("Enter a positive number : ");

		int number = scanner.nextInt();

		try {
			if (number < 0) {
				throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
			}

			Future<Long> future = executor.submit(new FactorialCalculator(number));

			long factorial = future.get();
			System.out.println("Factorial of " + number + " is: " + factorial);
		} catch (InterruptedException | ExecutionException | IllegalArgumentException e) {
			e.printStackTrace();

		} finally {
			executor.shutdown();
			scanner.close();
		}
	}
}
