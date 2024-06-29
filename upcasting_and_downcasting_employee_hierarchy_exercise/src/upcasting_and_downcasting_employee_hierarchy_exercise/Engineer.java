package upcasting_and_downcasting_employee_hierarchy_exercise;

public class Engineer extends Employee{
	String programmingLanguage;
	

	public Engineer (String name,int employeeId,double salary,String programmingLanguage) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	double calculateBonus() {
		
		return salary*0.1;
	}

}
