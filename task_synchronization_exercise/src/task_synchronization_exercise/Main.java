package task_synchronization_exercise;

public class Main {

	public static void main(String[] args) {

		TaskSynchronizationExercise tse = new TaskSynchronizationExercise();
		TaskExecutor thread1 = new TaskExecutor(tse,10);
		TaskMonitor thread2 = new TaskMonitor(tse,10);

		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
