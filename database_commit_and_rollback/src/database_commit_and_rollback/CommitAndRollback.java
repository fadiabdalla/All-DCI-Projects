package database_commit_and_rollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitAndRollback {

	public static final String URL = "jdbc:mysql://localhost:3306/mydb";
	public static final String USER = "root";
	public static final String PASSWORD = "Dci1234!";
	private static Connection connection;

	public static void main(String[] args) throws SQLException {

		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);

			// change auto commit status

			connection.setAutoCommit(false);

			// Execute update query
			updateQuery();
			System.out.println("Active transaction: " + isCurrentActiveTransaction(connection));

			// commit

			connection.commit();
			System.out.println("commit done!");

		} catch (Exception e) {
			try {
				// rollback
				connection.rollback();
				System.out.println("rollingback");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			System.out.println("Active transaction: " + isCurrentActiveTransaction(connection));

			connection.close();

		}
		
	}

	private static void updateQuery() {
		String sql = "INSERT INTO Employee VALUES (10,'john',17550)";
		try (Statement statement = connection.createStatement()) {

			statement.executeUpdate(sql);

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}
	
	private static boolean isCurrentActiveTransaction(Connection connection) throws SQLException {
        String sql = "SELECT COUNT(1) AS count FROM INFORMATION_SCHEMA.INNODB_TRX WHERE trx_mysql_thread_id = CONNECTION_ID()";

        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                int count = resultSet.getInt("count");
                return count > 0; // If count is greater than 0, there is an active transaction.
            }
        }

        return false;
    }

}