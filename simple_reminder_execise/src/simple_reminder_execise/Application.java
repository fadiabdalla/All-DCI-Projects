package simple_reminder_execise;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        String userMsg;
        int reminderTime;


        System.out.println("Enter your reminder Message:");
        userMsg = scanner.nextLine();

        System.out.println("After how long do you want the reminder to remind you? Enter the Time in SECONDS:");
        reminderTime = scanner.nextInt();

      

        Runnable reminder = new Runnable() {
            @Override
            public void run() {
                System.out.println(userMsg);
            }
        };

        executor.schedule(reminder, reminderTime, TimeUnit.SECONDS);

        try {
            Thread.sleep(reminderTime * 1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        try {
            
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
