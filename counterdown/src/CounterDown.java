import java.util.concurrent.atomic.AtomicInteger;

public class CounterDown implements Runnable {

    private AtomicInteger counterTime;

    public CounterDown(AtomicInteger counterTime) {
        super();
        this.counterTime = counterTime;
    }

    @Override
    public void run() {

        if(!counterTime.equals(0)) {

            counterTime.decrementAndGet();
            System.out.println("Counter: " + counterTime.get());
        }
    }

}
