package task_synchronization_exercise;

public class TaskMonitor extends Thread {
	int taskrequired= 0;

	TaskSynchronizationExercise tse;

	public TaskMonitor(TaskSynchronizationExercise tse, int taskrequired) {
		super();
		this.tse = tse;
		this.taskrequired=taskrequired;
	}

	public void run() {

		tse.taskLock.lock();
	    try {
	        while (tse.taskCount < 10) {
	            tse.taskCompleted.await();
	        }
	        
	        System.out.println("10 Tasks are Completed");
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    } finally {
	        tse.taskLock.unlock();
			

		}

	}
}
