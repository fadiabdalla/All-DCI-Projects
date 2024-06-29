package reentrantlock_exercise;

public class Main {

	public static void main(String[] args) {

		ReentrantLockExercise rle = new ReentrantLockExercise();

		IncrementThread thread1 = new IncrementThread(rle);
		IncrementThread thread2 = new IncrementThread(rle);
		IncrementThread thread3 = new IncrementThread(rle);
		DecrementThread thread4 = new DecrementThread(rle);
		DecrementThread thread5 = new DecrementThread(rle);
		DecrementThread thread6 = new DecrementThread(rle);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			thread6.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rle.counter);
		

	}

}
