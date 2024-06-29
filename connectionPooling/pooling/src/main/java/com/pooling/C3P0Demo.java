package com.pooling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Demo {

	 public static ComboPooledDataSource comboPooledDataSource = null;
	 
	static {
		
		comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/studentdb");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("Dci1234!");
		comboPooledDataSource.setMinPoolSize(5);
		comboPooledDataSource.setMaxPoolSize(10);
		
	}
	
	public static void main(String[] args) throws SQLException {


    	Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = comboPooledDataSource.getConnection();
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
