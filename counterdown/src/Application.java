import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AtomicInteger counterTime ;
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        int userInput;

        System.out.println("Set the Counter Down Time in SECONDS: ");
        userInput = scanner.nextInt();
        counterTime = new AtomicInteger(userInput);
        CounterDown counter = new CounterDown(counterTime);

        Runnable timeIsUpMsg = new Runnable() {

            @Override
            public void run() {

                System.out.println("Time's Up!");

            }

        };

        executor.scheduleAtFixedRate(counter, 0, 1, TimeUnit.SECONDS);

        executor.schedule(timeIsUpMsg, userInput, TimeUnit.SECONDS);

        executor.shutdown();
        try {

            executor.awaitTermination(userInput + 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
