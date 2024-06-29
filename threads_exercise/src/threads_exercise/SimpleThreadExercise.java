package threads_exercise;

public class SimpleThreadExercise {

	public static void main(String[] args) {

		SimpleThread thread1 = new SimpleThread();
		SimpleThread thread2 = new SimpleThread();
		SimpleThread thread3 = new SimpleThread();
		
		
		thread1.start();
        thread2.start();
        thread3.start();
        
        
        try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
