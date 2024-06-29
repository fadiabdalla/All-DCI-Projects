package upcasting_and_downcasting_employee_hierarchy_exercise;

public class Manager extends Employee{
	
	int teamSize;
	public Manager(String name,int employeeId,double salary,int teamSize) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.teamSize = teamSize;
	}

	@Override
	double calculateBonus() {
		
		return salary*0.03;
	}

}
