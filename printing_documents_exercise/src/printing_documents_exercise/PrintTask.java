package printing_documents_exercise;

public class PrintTask implements Runnable {
	private int id;

	public PrintTask(int id) {
		this.id = id;
	}

	@Override
	public void run() {

		System.out.println("The Document" + id + "printing started!");

		System.out.println("The Document" + id + " is printed!");

	}

}
