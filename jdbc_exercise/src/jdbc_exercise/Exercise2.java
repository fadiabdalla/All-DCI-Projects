package jdbc_exercise;

import java.sql.*;

public class Exercise2 {

	public static void main(String[] args) throws SQLException {
		Connection myconn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		String DATABASE_NAME = "InterviewDB2";
		try {
			// 1. Get a connection to a database
			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Dci1234!");
			// 2. Create statement
			myStmt = myconn.createStatement();
			// Create the database
			myStmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME);
			System.out.println("Database created successfully.");
			// Switch to the created database
			myStmt.executeUpdate("USE " + DATABASE_NAME);
			// Create Employees table if it doesn't exist
			String createTableQuery = "CREATE TABLE IF NOT EXISTS Employees (ID INT PRIMARY KEY, "
					+ "Name VARCHAR(100), Department VARCHAR(100), Salary DOUBLE)";
			myStmt.executeUpdate(createTableQuery);
			System.out.println("Employees table created successfully.");
			// Insert records into the Employees table
			myStmt.executeUpdate(
					"INSERT INTO Employees (ID, Name, Department, Salary) " + "VALUES (1, 'John Doe', 'IT', 50000.0)");
			myStmt.executeUpdate("INSERT INTO Employees (ID, Name, Department, Salary) "
				+ "VALUES (2, 'Jane Smith', 'HR', 60000.0)");
				
			// Retrieve and display all employee records
			ResultSet resultSet = myStmt.executeQuery("SELECT * FROM Employees");
			System.out.println("Employee Records:");
			while (resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				String department = resultSet.getString("Department");
				double salary = resultSet.getDouble("Salary");
				System.out.println(
						"ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
			}
			// Update an employee's salary
			int employeeIdToUpdate = 1;
			double newSalary = 55000.0;
			int rowsAffected = myStmt
					.executeUpdate("UPDATE Employees SET Salary = " + newSalary + " WHERE ID = " + employeeIdToUpdate);
			if (rowsAffected > 0) {
				System.out.println("Employee salary updated successfully.");
			} else {
				System.out.println("Failed to update employee salary.");
			}
			// Display updated employee records
			resultSet = myStmt.executeQuery("SELECT * FROM Employees");
			System.out.println("Updated Employee Records:");
			while (resultSet.next()) {
				int id = resultSet.getInt("ID");
				String name = resultSet.getString("Name");
				String department = resultSet.getString("Department");
				double salary = resultSet.getDouble("Salary");
				System.out.println(
						"ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myconn != null) {
				myconn.close();
			}
		}
	}
}