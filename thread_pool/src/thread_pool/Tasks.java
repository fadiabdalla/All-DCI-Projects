package thread_pool;

public class Tasks implements Runnable{
	
	private int id;
	
	public Tasks(int id) {
		
		this.id = id;
	}

	@Override
	public void run() {

		System.out.println("Task: " + id + ": started...");
		
		try {
			Thread.sleep(100);
			
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Task " + id + ": is finished.");
	}

}
