package restaurant_seating_system_exercise;

import java.util.concurrent.Semaphore;

public class Tables {

	private int availableTables = 15;
	private Semaphore semaphore = new Semaphore(availableTables, true);

	public  void useTable() {
		try {
			semaphore.acquire();
			System.out.println("Customer seated. Available Tables: " + semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void newFreeTable() {
		semaphore.release();
		System.out.println("Customer left. Available Tables: " + semaphore.availablePermits());
	}
}
