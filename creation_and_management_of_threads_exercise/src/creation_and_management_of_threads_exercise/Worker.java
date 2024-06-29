package creation_and_management_of_threads_exercise;

public class Worker extends Thread {

	private String workerName;

	public Worker(String workerName) {

		this.workerName = workerName;
	}

	@Override
	public void run() {

		System.out.println("The worker : " + workerName + " is performing a task");
	}

}
