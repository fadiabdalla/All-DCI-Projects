package singlton_design_pattern;

public class ThreadSafeSingleton {

	static ThreadSafeSingleton se = new ThreadSafeSingleton();

	String message;

	private ThreadSafeSingleton() {

		message = "Instance created.";

	}

	public static ThreadSafeSingleton getInstance() {
		if (se == null) {
			  synchronized (ThreadSafeSingleton.class) {
	                if (se == null) {
	                    se = new ThreadSafeSingleton();
	                }
	            }
	        }
		return se;
	}

	public void displayMessage() {

		System.out.println(message);
	}
}