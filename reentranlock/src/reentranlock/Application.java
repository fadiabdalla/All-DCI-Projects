package reentranlock;

public class Application {

	public static void main(String[] args) {

		ReentrantLockExample rl = new ReentrantLockExample();
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				try {
					rl.thread1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					rl.thread2();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
			
		});
		
		thread1.start();
		thread2.start();
		
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		rl.finished();
		
	}

}
