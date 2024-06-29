package polymorphism;


class Bike{
	
	void run (){
		
		
		System.out.println("Running...");
	}
	
}

public class BMX extends Bike{
	@Override
	void run() {
		
		System.out.println("Running with 40km/h");
	}


		
		public static void main(String[] args) {
			
			Bike bike = new BMX(); // runtime polymorphism (upcasting)
			bike.run();
		
		

		
		
	}

}
