package list_tables_in_postgres_exercise;

import java.sql.Connection;
import java.util.List;

public class TableListenerApp {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			conn = DciDbConnector.getConnection();
			if (conn != null) {
				System.out.println("-Connection created");
				System.out.println("-Listing Tables.");
				System.out.println("-Tables: ");
				List<String> tables = DciDbConnector.listTables();
				for (String tableName : tables) {
					System.out.println(tableName);
				}
			} else {
				System.out.println("Connection NOT created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DciDbConnector.close(conn);
		}
	}
}