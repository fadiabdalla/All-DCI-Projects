package printing_documents_exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(3);

		int[] ids = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		for (int id : ids) {

			es.submit(new PrintTask(id));

		}

		es.shutdown();

		try {
			es.awaitTermination(6, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
