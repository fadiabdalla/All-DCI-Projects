package callable_and_future_exercise2;

import java.util.concurrent.Callable;

public class SumCalculator implements Callable<Long> {

	private int start;
	private int end;
	private long result;

	public SumCalculator(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public Long call() throws Exception {

		for (int i = start; i < end; i++) {

			result = result + i;
		}

		return result;
	}

}
