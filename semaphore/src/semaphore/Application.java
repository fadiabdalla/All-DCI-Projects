package semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args) {

//		Semaphore semaphore = new Semaphore(3);
//		
//		semaphore.release(); // it has a similar impact as the unlock() from Reentrantlock
//		try {
//			semaphore.acquire(); // it has a similar impact as the lock() from Reentrantlock
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Number of premits : " + semaphore.availablePermits());
		
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int n = 0; n < 300; n++) {
			
			executor.submit(new Runnable() {

				@Override
				public void run() {

				Messages.getValue().send();	
					
					
				}
			});
			
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(5, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
