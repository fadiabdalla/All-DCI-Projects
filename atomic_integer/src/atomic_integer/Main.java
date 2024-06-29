package atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;

class Counter extends Thread{
	
	AtomicInteger count;
	
	Counter(){
		
		count = new AtomicInteger();
	}
	
	public void run() {
		
		int maxValue = 30000;
		for(int n = 0; n < maxValue; n++) {
			
			//count.addAndGet(1);
			
			count.incrementAndGet();
			
		}
		
	}
}

public class Main {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		Thread thread1 = new Thread(counter, "Thread1");
		Thread thread2 = new Thread(counter, "Thread2");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(counter.count);
		
		
		
	}

}
