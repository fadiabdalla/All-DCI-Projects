package jdbc_connection_test;

import java.sql.*;


public class Driver {

	public static void main(String[] args) throws SQLException {

		Connection myconn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
			// 1. Get a connection to a database

			myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Dci1234!");

			// 2. Create a statement

			myStmt = myconn.createStatement();

			// 3. Excute a sql query

			myRs = myStmt.executeQuery("SELECT * FROM Employee");

			// 4. process the result set

			while (myRs.next()) {

				System.out.println(myRs.getString("id") + "," + myRs.getString("name"));

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
