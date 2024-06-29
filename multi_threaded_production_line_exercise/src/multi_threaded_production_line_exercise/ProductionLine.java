package multi_threaded_production_line_exercise;

public class ProductionLine {

	Object lock1 = new Object();
	Object lock2 = new Object();

	public void producePart(String partName) {
		
		synchronized(lock1) {

		System.out.println(Thread.currentThread().getName() + " has produced " + partName);

		}
	}

	public void assembleProduct(String productName) {
		
		synchronized(lock2) {

		System.out.println(Thread.currentThread().getName() + " has assembled " + productName);

		}
	}

}
