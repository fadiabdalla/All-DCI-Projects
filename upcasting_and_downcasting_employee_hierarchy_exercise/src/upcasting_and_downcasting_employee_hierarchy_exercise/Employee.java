package upcasting_and_downcasting_employee_hierarchy_exercise;

abstract class Employee {
	
	String name;
	int employeeId;
	double salary;
	
	abstract double calculateBonus();

}
