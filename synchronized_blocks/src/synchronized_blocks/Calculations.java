package synchronized_blocks;

import java.util.*;

public class Calculations {

	private Random random = new Random();
	private Object firstLock = new Object();
	private Object secondLock = new Object();

	private List<Integer> firstList = new ArrayList<>();
	private List<Integer> secondList = new ArrayList<>();

	public void firstCalculation() {

		synchronized (firstLock) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			firstList.add(random.nextInt(200));
		}
	}

	public void secondCalculation() {

		synchronized (secondLock) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			secondList.add(random.nextInt(200));

		}
	}

	public void calculating() {

		for (int i = 0; i < 500; i++) {

			firstCalculation();
			secondCalculation();
		}
	}

	public void main() {

		System.out.println("Started...");

		long started = System.currentTimeMillis();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				calculating();
			}

		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				calculating();
			}

		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		long ended = System.currentTimeMillis();
		System.out.println("Duration : " + (ended - started));

		System.out.println("First list : " + firstList.size() + " Second List: " + secondList.size());

	}
}
