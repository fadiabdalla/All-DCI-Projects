package upcasting_and_downcasting_employee_hierarchy_exercise;

public class Intern extends Employee{
	int durationInWeeks;
	
	

	public Intern(String name,int employeeId,double salary,int durationInWeeks) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.durationInWeeks = durationInWeeks;
	}



	@Override
	double calculateBonus() {
		
		return 0;
	}

}
