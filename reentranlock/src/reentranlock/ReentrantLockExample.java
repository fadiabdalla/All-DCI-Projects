package reentranlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

	private int value = 0;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	private void increaseValue() {

		for (int i = 0; i < 20000; i++) {

			value++;
		}
		
	}

	public void thread1() throws InterruptedException {

		lock.lock();
		
		System.out.println("Waiting...");
		condition.await();
		
		System.out.println("Another Thread woke me up!");
		
		try {
		increaseValue();
		} finally {
		lock.unlock();
		}
	}

	

	public void thread2() throws InterruptedException {

		lock.lock();
		Thread.sleep(1000);
		
		System.out.println("Press enter to continue");
		new Scanner(System.in).nextLine();
		System.out.println("You pressed enter key!");
		condition.signal();

		try {
		increaseValue();
		} finally {
		lock.unlock();
		System.out.println("dsds");
		}
	}

	public void finished() {
		
		System.out.println("Value = " + value);

	}
}
