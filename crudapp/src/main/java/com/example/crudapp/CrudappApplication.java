package com.example.crudapp;

import com.example.crudapp.dao.EmployeeDAO;
import com.example.crudapp.dao.EmployeeDAOInterface;
import com.example.crudapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(EmployeeDAOInterface employeeDAO){

		return runner -> {
			//  createEmployee(studentDAO);
			createMultipleEmployees(employeeDAO);

			//readEmployee(employeeDAO);
			//employeeQuery(employeeDAO);
			// employeeQueryByLastName(employeeDAO);
			// updateEmployee(employeeDAO);
			//deleteEmployeeById(employeeDAO);
			//deleteAllEmployee(employeeDAO);
		};




	}

	private void deleteAllEmployee(EmployeeDAOInterface employeeDAO) {

		System.out.println("Deleting all the employees");

		int rowsDeleted = employeeDAO.deleteAll();
		System.out.println(rowsDeleted + " Employees are deleted ");
	}

	private void deleteEmployeeById(EmployeeDAOInterface employeeDAO) {
		int id = 1;

		employeeDAO.delete(id);

		System.out.println("Employee with id = " + id + "  is deleted!");
	}

	private void updateEmployee(EmployeeDAOInterface employeeDAO) {
		// Find employee based on id
		int id = 1;
		System.out.println("Retrieving the employee whith id : " + id);
		Employee employee = employeeDAO.findById(id);
		System.out.println("Updating employee...");

		// Modify the employee's information
		employee.setFirstName("Sam");
		employee.setLastName("Sträßer");
		employeeDAO.update(employee);

		// show updated employee

		System.out.println("Updated employee: " + employee);


	}

	private void employeeQueryByLastName(EmployeeDAOInterface employeeDAO) {

		// Get the list of employees
		List<Employee> employees = employeeDAO.findByLastName("Smith");
		for(Employee e : employees){

			System.out.println(e);
			System.out.println("");
		}
	}

	private void employeeQuery(EmployeeDAOInterface employeeDAO) {

		// Get the list of employees
		List<Employee> employees = employeeDAO.findAll();
		for(Employee e : employees){

			System.out.println(e);
			System.out.println("");
		}
	}

	private void readEmployee(EmployeeDAOInterface employeeDAO) {
		// Create the employee object
		Employee newEmployee = new Employee("Fadi", "Georgos Abdallah", "fadiabdalla@example.com");

		//Save employee
		employeeDAO.save(newEmployee);

		// show the id of this new employee
		System.out.println("New employee id: " + newEmployee.getId());

		// Retrive employee based on the id
		System.out.println("\nRetriving employee with id: " + newEmployee.getId());

		Employee employee = employeeDAO.findById(newEmployee.getId());
		System.out.println("Employee found: " + employee);
	}



	public void createMultipleEmployees(EmployeeDAOInterface employeeDAO){


		// Create multiple employees
		System.out.println("Creating 10 employee object ...");
		Employee newEmployee1 = new Employee("William", "Holmes", "williamholmes@example.com");
		Employee newEmployee2 = new Employee("Emma", "Smith", "emmasmith@example.com");
		Employee newEmployee3 = new Employee("Michael", "Johnson", "michaeljohnson@example.com");
		Employee newEmployee4 = new Employee("Emily", "Brown", "emilybrown@example.com");
		Employee newEmployee5 = new Employee("Jacob", "Davis", "jacobdavis@example.com");
		Employee newEmployee6 = new Employee("Olivia", "Miller", "oliviamiller@example.com");
		Employee newEmployee7 = new Employee("Daniel", "Wilson", "danielwilson@example.com");
		Employee newEmployee8 = new Employee("Sophia", "Taylor", "sophiataylor@example.com");
		Employee newEmployee9 = new Employee("Matthew", "Anderson", "matthewanderson@example.com");
		Employee newEmployee10 = new Employee("Charlotte", "Martinez", "charlottemartinez@example.com");

		// save the employee object
		System.out.println("Saving the employees object ...");
		employeeDAO.save(newEmployee1);
		employeeDAO.save(newEmployee2);
		employeeDAO.save(newEmployee3);
		employeeDAO.save(newEmployee4);
		employeeDAO.save(newEmployee5);
		employeeDAO.save(newEmployee6);
		employeeDAO.save(newEmployee7);
		employeeDAO.save(newEmployee8);
		employeeDAO.save(newEmployee9);
		employeeDAO.save(newEmployee10);



	}
	private void createEmployee(EmployeeDAOInterface employeeDAO) {

		// create the employee object
		System.out.println("Creating the employee object ...");
		Employee employee = new Employee("Bob", "Smith", "bobsmith@example.com");

		// save the employee object
		System.out.println("Saving the employee object ...");

		employeeDAO.save(employee);
		// Show the id of the new employee
		System.out.println("ID: " + employee.getId());

	}


}
