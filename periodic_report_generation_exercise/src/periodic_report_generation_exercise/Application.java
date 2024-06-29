package periodic_report_generation_exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		Runnable generateReport = new Runnable() {

			@Override
			public void run() {

				System.out.println("Generating report...");
				System.out.println(now.format(formatter));
			}
		};

		executor.scheduleAtFixedRate(generateReport, 0, 10, TimeUnit.SECONDS);

		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}