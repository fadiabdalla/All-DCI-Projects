package jdbc_exercise;

import java.sql.*;

public class Driver {

	public static void main(String[] args) throws SQLException {

		Connection mycon = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			mycon = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase", "root", "Dci1234!");

			myStmt = mycon.createStatement();
			myRs = myStmt.executeQuery("SELECT * FROM students");

			while (myRs.next()) {

				System.out.println(myRs.getString("id") + "," + myRs.getString("name") + "," + myRs.getString("age"));

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
			if (mycon != null) {
				mycon.close();
			}
		}

	}

}
