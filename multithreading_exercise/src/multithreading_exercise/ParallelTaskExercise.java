package multithreading_exercise;

public class ParallelTaskExercise {

	public static void main(String[] args) {

		// Create three instances of ParallelTask with different numbers
		ParallelTask task1 = new ParallelTask(10);
		ParallelTask task2 = new ParallelTask(15);
		ParallelTask task3 = new ParallelTask(20);

		// Create three threads, each responsible for executing one ParallelTask
		// instance
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);

		// Start all three threads to execute tasks in parallel
		thread1.start();
		thread2.start();
		thread3.start();

		try {
			// Use join method to ensure all threads have completed their tasks
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// Handle InterruptedException if it occurs
			System.err.println(e.getMessage());
		}

		// Print a message indicating that all threads have been executed
		System.out.println("All Threads have been executed.");
	}
}
