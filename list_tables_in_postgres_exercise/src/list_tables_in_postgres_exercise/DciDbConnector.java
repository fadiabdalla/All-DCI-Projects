package list_tables_in_postgres_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DciDbConnector {
	//private static String postgresDriver = "org.postgresql.Driver";
	private static String databaseUrl = "jdbc:postgresql://localhost:5432/";
	private static String uid = "postgres";
	private static String password = "root";
	private static String dbName = "Test";
	private static Connection conn = null;

	public static Connection getConnection() {
		return getConnection(dbName);
	}

	public static Connection getConnection(String dbName) {
		try {
			if (conn == null || conn.isClosed()) {
				//Class.forName(postgresDriver);
				String url = (databaseUrl + dbName);
				conn = DriverManager.getConnection(url, uid, password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static boolean close(AutoCloseable closeable) {
		try {
			if (closeable != null) {
				closeable.close();
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static List<String> listTables() {
		String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'public';";
		List<String> tables = new ArrayList<String>();
		Statement stmt = null;
		try {
			stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String tableName = rs.getString(1);
				tables.add(tableName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
		}
		return tables;
	}

}
