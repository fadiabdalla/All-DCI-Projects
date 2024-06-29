package com.pooling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Hello world!
 *
 */
public class DBCPDemo_BasicDataSource 
{
	//creating instance of basicdatasource
	//two types of datasource are present in apache dbcp
	//1.BasicDataSource
	//2.PoolingDataSource
	public static BasicDataSource dataSource = null;
	
	static{

		dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/studentdb?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("Dci1234!");
		
		
		
		// specify minimum number of idle connections
		//specify max number of idle connections
		//specify total number of max connections
		
		dataSource.setMinIdle(5);
		dataSource.setMaxIdle(10);
		dataSource.setMaxTotal(10);
	}
	
    public static void main( String[] args ) throws SQLException
    {
      
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
