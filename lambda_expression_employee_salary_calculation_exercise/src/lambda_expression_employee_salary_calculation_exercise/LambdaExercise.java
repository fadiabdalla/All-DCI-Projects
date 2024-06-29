package lambda_expression_employee_salary_calculation_exercise;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

	static List<String> calculateAnnualBonuses(List<Employee> employees) {

		List<String> bonus = new ArrayList<>();
		employees.forEach((employee) -> {

			if (employee.position.equals("Manager")) {

				bonus.add(employee.name + "- 15% bonus = " + (0.15 * employee.salary) + "€");
			} else if (employee.position.equals("Developer")) {

				bonus.add(employee.name + "- 10% bonus = " + (0.1 * employee.salary) + "€");
			} else if (employee.position.equals("Intern")) {

				bonus.add(employee.name + "- 5% bonus = " + (0.05 * employee.salary) + "€");
			} else {
				bonus.add(employee.name + "- 0% bonus = 0€");
			}

		});

		return bonus;
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		Employee employee1 = new Employee("Fadi", "Manager", 5500);
		Employee employee2 = new Employee("Sam", "Developer", 3500);
		Employee employee3 = new Employee("Sarah", "Intern", 1500);
		Employee employee4 = new Employee("Mike", "Customer Support", 2300);

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		calculateAnnualBonuses(employees).forEach(employee -> {

			System.out.println(employee);
		});

	}

}
