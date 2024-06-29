package abstract_calasses_examples;

abstract class Machine {
	
	
	abstract void on();
	

}


class Tesla extends Machine{

	@Override
	void on() {

	System.out.println("Turn the machine on.");
	
	}
	
	
	public static void main(String args[]) {
		
	Machine machine = new Tesla();
	
	machine.on();
		
		
		
	}
	
}