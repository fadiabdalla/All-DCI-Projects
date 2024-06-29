package reentrantlock_exercise;

public class IncrementThread extends Thread {

	ReentrantLockExercise rle ;

	public IncrementThread(ReentrantLockExercise rle) {
		super();
		this.rle = rle;
	}

	public void run() {
		rle.lock.lock();
		try {
			rle.counter += 5;
		} finally {
			rle.lock.unlock();
		}
	}

}
