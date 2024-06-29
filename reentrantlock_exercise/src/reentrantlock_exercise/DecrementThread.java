package reentrantlock_exercise;

public class DecrementThread extends Thread {

ReentrantLockExercise rle;

	public DecrementThread(ReentrantLockExercise rle) {
		super();
		this.rle = rle;
	}

	public void run() {
		rle.lock.lock();
		try {
			rle.counter -= 3;
		} finally {
			rle.lock.unlock();
		}
	}

}
