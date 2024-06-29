package callable_and_future_exercise;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Long> {

	private int number;
	private long factorial = 1;

	public FactorialCalculator(int number) {
		super();
		this.number = number;
	}

	@Override
	public Long call() throws Exception {

		for (int x = 1; x <= number; x++) {

			factorial *= x;

		}

		return factorial;
	}

}
