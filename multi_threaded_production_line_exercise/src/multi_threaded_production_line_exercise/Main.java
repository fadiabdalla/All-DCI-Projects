package multi_threaded_production_line_exercise;

public class Main {

	public static void main(String[] args) {

		ProductionLine pl = new ProductionLine();

		String[] names = { "Fadi", "Sam", "Ella", "Paul", "Pia", "Joe" };
		Thread[] workers = new Thread[names.length];

		for (int i = 0; i < names.length; i++) {
			workers[i] = new Thread(new Worker(names[i]));
			workers[i].start();
		}
	}

}
