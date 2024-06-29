package jdbc2;

import java.sql.*;

public class Queries {

	/*
	 * Commonly used methods of statement interface: 1. execute (String SQL): It is
	 * used to execute SQL DDL statements. sntax: public boolean execute(String SQL)
	 */

	public static void main(String[] args) throws SQLException {

		Connection mycon = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// 1. 1. Get a connection to a database
			mycon = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase", "root", "Dci1234!");

			// 2.Create Statement
			myStmt = mycon.createStatement();

			// sql query to create a table
			String createTableQuery = "CREATE TABLE IF NOT EXISTS user(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), age INT)";

			String insertQuery= "INSERT INTO user (name,age) VALUES ('PETER', 10)";
			String updateQuery = "UPDATE user SET name = 'sascha' WHERE id = 3";
			//myStmt.execute(insertQuery);
			boolean bool = myStmt.execute(createTableQuery);
			System.out.println(bool);
			
			
			//UPDATE QUERY
			
			int rowsAffected = myStmt.executeUpdate(updateQuery);
			
			if(rowsAffected > 0) {
				System.out.println("Data updated successfully!");
				
			}else {
				System.out.println("No records were updated!");
			}
			System.out.println(rowsAffected);
			
			
			myRs = myStmt.executeQuery("select * from user");
			
			
			System.out.println("Table created successfully");

			while(myRs.next()) {
				
				System.out.println(myRs.getString("name") + "," + myRs.getString("age"));
				
			}
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (myStmt != null) {

				myStmt.close();
			}
			if (mycon != null) {
				
				mycon.close();
			}

		}
	}
}
