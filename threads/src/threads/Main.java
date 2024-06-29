package threads;

class ThreadExample extends Thread{
	
	public void run() {
		
		for (int n = 1; n < 3; n++) {
			try {
				Thread.sleep(300);
				System.out.println("Current thread :" + Thread.currentThread().getName());
			} catch (InterruptedException e) {

				System.out.println(e.getMessage());
			}
			System.out.println(n);
			
		}
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		
		ThreadExample thread1 = new ThreadExample();
		ThreadExample thread2 = new ThreadExample();
		ThreadExample thread3 = new ThreadExample();
		
		thread1.start();
		
		try {
			System.out.println("Current thread :" + Thread.currentThread().getName());
			thread1.join();
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}
		
		thread2.start();
		
		try {
			System.out.println("Current thread :" + Thread.currentThread().getName());
			thread2.join();
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		thread3.start();
		
		
	}

}
