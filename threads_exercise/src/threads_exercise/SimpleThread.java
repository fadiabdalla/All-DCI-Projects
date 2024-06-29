package threads_exercise;

import java.util.Random;

public class SimpleThread extends Thread{
	Random random = new Random();

	@Override
	public void run() {
		System.out.println("Thread Name : " + Thread.currentThread().getName() + "\nRandom Number : " + random.nextInt(1000) );
		
	}
	

}
