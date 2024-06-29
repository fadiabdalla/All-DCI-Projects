package creation_and_management_of_threads_exercise;

public class TaskManagementExercise {

	public static void main(String[] args) {

		Worker worker1 = new Worker("Fadi");
		Worker worker2 = new Worker("Mo");
		Worker worker3 = new Worker("Frank");
		Worker worker4 = new Worker("Daisy");
		Worker worker5 = new Worker("Emma");

		worker1.start();
		worker2.start();
		worker3.start();
		worker4.start();
		worker5.start();

		try {
			worker1.join();
			worker2.join();
			worker3.join();
			worker4.join();
			worker5.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("All workers are performing tasks!");
	}

}
