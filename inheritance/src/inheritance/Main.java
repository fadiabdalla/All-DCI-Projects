package inheritance;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		SelfDrivinigCar sdc = new SelfDrivinigCar();
		Truck truck= new Truck();
		MotorCycle mc = new MotorCycle();
		car.engine();
		car.drive();
		car.airConditioner();
		
		sdc.detectObjects();
		
		truck.load();
		mc.fingerPrintLock();
	}

}
