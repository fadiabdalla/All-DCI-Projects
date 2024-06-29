package jdbc2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatements {

	public static void main(String[] args) throws SQLException {
        Connection myconn = null;
        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        try {
            // 1. Get a connection to a database
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Dci1234!");

            Scanner sc = new Scanner(System.in);
            System.out.println("What age do you want to search");
            int age = sc.nextInt();

            // 2. Create a prepared statement with a parameterized query
            String sql = "SELECT * FROM user WHERE age = ?";
            myStmt = myconn.prepareStatement(sql);

            // 3. Set the parameter value
            myStmt.setInt(1, age);

            // 4. Execute the query
            myRs = myStmt.executeQuery();

            // 5. Process the result set
            while (myRs.next()) {
                System.out.println("Name: " + myRs.getString("name") + ", Age: " + myRs.getInt("age"));
            }
        } catch (SQLException ex) {
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
