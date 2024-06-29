package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Queries {

	/*
	 * Commonly used methods of statement interface: 1. execute (String SQL): It is
	 * used to execute SQL DDL statements. sntax: public boolean execute(String SQL)
	 */

	public static void main(String[] args) {

		Connection mycon = null;
		Statement myStmt = null;

		try {

			// 1. 1. Get a connection to a database
			mycon = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase", "root", "Dci1234!");

			// 2.Create Statement
			myStmt = mycon.createStatement();

			// sql query to create a table
			String createTableQuery = "CREATE TABLE IF NOT EXISTS users(id INT aUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), age INT";

			myStmt.execute(createTableQuery);
			System.out.println("Table created successfully");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
