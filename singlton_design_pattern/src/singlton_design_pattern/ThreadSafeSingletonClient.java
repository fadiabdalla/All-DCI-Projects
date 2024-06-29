package singlton_design_pattern;

public class ThreadSafeSingletonClient {

    public static void main(String[] args) {
        int numThreads = 10;

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
            	ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
                singleton.displayMessage();
            });
            thread.start();
        }
    }
}