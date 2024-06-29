package task_synchronization_exercise;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskSynchronizationExercise {
	
	int taskCount = 0;
	
	Lock taskLock = new ReentrantLock();
	
	Condition taskCompleted = taskLock.newCondition();
	
	
	
	
	

}
