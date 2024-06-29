package fixed_thread_pool_exercise;



public class TaskProcessor implements Runnable{
	
	private int number;
	

	public TaskProcessor(int number) {
		
		this.number = number;
	}

	public  long factorial( int number) {
		if (number == 0 || number == 1) {
			
			return 1;
		} else {
			return number * factorial(number - 1);
		}
		
	}
	
	@Override
	public void run() {
		
		
		
		System.out.println("The factorial for " + number + " = " + factorial(number));
		

	}

}
