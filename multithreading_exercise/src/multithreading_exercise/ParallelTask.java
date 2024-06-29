package multithreading_exercise;

public class ParallelTask extends Thread {

	private int number;
	

	public ParallelTask(int number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		long factorial = 1;

		if (number < 0) {

			System.out.println("Factorial is not defined for negative numbers.");

			return;
		}

		for (int x = 1; x <= number; x++) {

			factorial *= x;

		}

		System.out.println("Factorial of " + number + " is: " + factorial);

	}

}
