package task_synchronization_exercise;

public class TaskExecutor extends Thread {

	TaskSynchronizationExercise tse;
	int taskrequired;

	public TaskExecutor(TaskSynchronizationExercise tse,int taskrequired) {
		super();
		this.tse = tse;
		this.taskrequired = taskrequired;
	}
	
	public void excute () {
		
		tse.taskLock.lock();

		try {
			tse.taskCount++;
			tse.taskCompleted.signal();
			System.out.println("Task " + tse.taskCount + " is done.");

		} finally {
			tse.taskLock.unlock();

		}

		
		
	}

	public void run() {
		
		for(int i = 0; i <20; i++) {
			
			excute();
		}

		
	}

}
