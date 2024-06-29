package scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		
		Runnable repeatedTask = new Runnable() {

			@Override
			public void run() {

				System.out.println("Beep");
				
			}
			
		};
		
		Runnable singelTask = new Runnable() {

			@Override
			public void run() {

				System.out.println("One-time task");
				
			}
			
		};
		
		// Schedule repeatedTask to run every 2 seconds , with 3 seconds delay.
		executor.scheduleAtFixedRate(repeatedTask, 3, 2, TimeUnit.SECONDS);
		
		
		executor.schedule(singelTask, 10, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
