package atomic_integer_exercise;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements Runnable {

	private AtomicInteger count = new AtomicInteger(0);

	public AtomicInteger getCount() {
		return count;
	}

	public void countIncrement() {

		for (int n = 0; n < 20000; n++) {

			count.incrementAndGet();
		}

	}

	public void countDecrement() {

		for (int n = 0; n < 10000; n++) {

			count.decrementAndGet();
		}
	}

	@Override
	public void run() {

		countIncrement();
		countDecrement();

	}

}
