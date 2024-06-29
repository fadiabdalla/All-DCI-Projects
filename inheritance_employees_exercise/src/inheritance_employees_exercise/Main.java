package inheritance_employees_exercise;

public class Main {

	public static void main(String[] args) {

		 Manager manager = new Manager();
	        manager.setName("Fadi Georgous Abdallah");
	        manager.setEmployeeID(1257);
	        manager.setBaseSalary(4750);
	        manager.setBonus(1500);

	        Developer developer = new Developer();
	        developer.setName("Sandy Kassa");
	        developer.setEmployeeID(1260);
	        developer.setHourlyRate(30);
	        developer.setHoursWorked(165);

	        System.out.println("Manager Information:");
	        manager.displayInfo();
	        manager.calculateSalary();
	        

	        System.out.println();
	        System.out.println("Developer Information:");
	        developer.displayInfo();
	        developer.calculateSalary();
	    }
	}