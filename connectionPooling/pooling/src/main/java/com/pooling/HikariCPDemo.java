package com.pooling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPDemo {
	
	
	private static HikariDataSource dataSource = null;
	
	static {
		
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/studentdb");
		config.setUsername("root");
		config.setPassword("Dci1234!");
		config.addDataSourceProperty("minimumIdle", 5);
		config.addDataSourceProperty("maximumPoolSize", 5);
	
		dataSource = new HikariDataSource(config);
		
		
	}

	public static void main(String[] args) throws SQLException {

		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM tblstudent");
			while(resultSet.next()) {
				
				System.out.println("Student ID: " + resultSet.getInt("studentId"));
				System.out.println("Name: " + resultSet.getString("studentName"));
				System.out.println("Date of birth: " + resultSet.getDate("dob"));
				System.out.println("Address: " + resultSet.getString("address"));
				System.out.println("-----------------------------------------");

			}
			
		}catch(Exception ex){
			ex.printStackTrace();
			
		}finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
		

    	
    	
    }
}
