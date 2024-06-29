package traffic_intersection_exercise;

public class TrafficIntersectionSimulation {

	public static void main(String[] args) {

		TrafficLane northLane = new TrafficLane("North");
		TrafficLane eastLane = new TrafficLane("East");
		TrafficLane southLane = new TrafficLane("South");
		TrafficLane westLane = new TrafficLane("West");

		northLane.start();
		
		

		
		try {
			northLane.join();
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}
		
		eastLane.start();
			
		try {
			eastLane.join();
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}
		
		southLane.start();
		
		
		try {
			southLane.join();
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}
		
		westLane.start();	
		
		try {
			
			westLane.join();
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}


	}
}