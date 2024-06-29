package com.pooling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDataSource;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;


public class DBCPDemo_PoolingDataSource {

public static PoolingDataSource<PoolableConnection> dataSource = null;
	
	static{

		
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "Dci1234!");
		
		ConnectionFactory connectionFactory = 
				new DriverManagerConnectionFactory("jdbc:mysql://localhost:3306/studentdb",properties);
		
		PoolableConnectionFactory poolableConnectionFactory = new PoolableConnectionFactory(connectionFactory,null);
		
				GenericObjectPoolConfig<PoolableConnection> config = new GenericObjectPoolConfig<>();
				
		// specify minimum number of idle connections
		//specify max number of idle connections
		//specify total number of max connections
		config.setMinIdle(5);
		config.setMaxIdle(10);
		config.setMaxTotal(20);
		
		
		ObjectPool<PoolableConnection> connectionPool = new GenericObjectPool<>(poolableConnectionFactory,config);
		
		poolableConnectionFactory.setPool(connectionPool);
		
		dataSource = new PoolingDataSource<>(connectionPool);
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
