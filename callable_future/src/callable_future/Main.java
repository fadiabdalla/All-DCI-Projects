package callable_future;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Task implements Callable<String>{

	private String name;
	
	public Task(String name) {
		
		this.name = name;
		
	}
	
	@Override
	public String call() throws Exception {

		System.out.println(name + " executed on : " + LocalDateTime.now().toString());
		
		return name;
	}
	
	
}

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		Future<String> future1 = executor.submit(new Task("Task1"));
		Future<String> future2 = executor.submit(new Task("Task2"));
		Future<String> future3 = executor.submit(new Task("Task3"));
		
		String thread1 = future1.get();
		String thread2 = future2.get();
		String thread3 = future3.get();
		
		
		System.out.println("Thread completed: " + thread1);
		System.out.println("Thread completed: " + thread2);
		System.out.println("Thread completed: " + thread3);
		
		
		executor.shutdown();
		executor.awaitTermination(4, TimeUnit.MINUTES);
		
		
		
		
		
		
		
	}

}
