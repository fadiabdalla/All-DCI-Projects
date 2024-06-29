package traffic_intersection_exercise;

import java.util.Random;

public class TrafficLane extends Thread  {
	
	private String lane;
	
	Random random = new Random();
	int sleep = random.nextInt(500);

	public TrafficLane(String lane) {
		
		this.lane = lane;
	}

	@Override
	public void run() {
		System.out.println("The Vehicle coming from " + lane + " lane crossing. ");
		
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	} 

}
