package com.jspiders.jdbctask.task;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcTask {
	private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static int result;
	private static String query;
	private static Scanner scanner;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath = 
			"E:\\WEJE3\\jdbctask\\resources\\db_info.properties";
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);
			
            Class.forName(properties.getProperty("driverPath"));
			
			connection = DriverManager.getConnection
					(properties.getProperty("dburl"), properties);
			Scanner scanner = new Scanner(System.in);
		
			
			// Create table using static query
			if (result == 0) {
                System.out.println("Data already exists in the table and was ignored");
			query = "create table student " 
					+ "(id int(4) primary key, " 
					+ "name varchar(50), " 
					+ "email varchar(20), "
					+ "city varchar(10))";
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Table created");
		}else {
            System.out.println("Data inserted successfully");
        }
			
			// inserting 5 records dynamic query in loop
			System.out.println("Inserting records");
			for (int i = 1; i <= 5; i++) {
				query = "insert into student " 
						+ "values (?,?,?,?)";
				preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter Roll number : ");
				int id = scanner.nextInt();
				preparedStatement.setInt(1, id);
				System.out.println("Enter Student name : ");
				String name = scanner.next();
				preparedStatement.setString(2, name);
				System.out.println("Enter your email : ");
				String email = scanner.next();
				preparedStatement.setString(3, email);
				System.out.println("Enter your city : ");
				String city = scanner.next();
				preparedStatement.setString(4, city);
				result = preparedStatement.executeUpdate();
				System.out.println(result + " row(s) affected");
			}

			// Display all records using static query
			query = "select * from student";
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + " | " 
						+ resultSet.getString(2) + " | "
						+ resultSet.getString(3) + " | " 
						+ resultSet.getString(4));
			}

			// updating 2 records using dynamic query
			query = "update student " 
					+ "set email = ? " 
					+ "where id > 3";
			preparedStatement = connection.prepareStatement(query);
			System.out.println("Enter the updated value : ");
			String email = scanner.next();
			preparedStatement.setString(1, email);
			result = preparedStatement.executeUpdate();
			System.out.println(result + " row(s) affected");

			// Display all records using static query
			query = "select * from student";
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + " | " 
						+ resultSet.getString(2) + " | "
						+ resultSet.getString(3) + " | " 
						+ resultSet.getString(4));
			}
			
			//delete 1 record using static query
			query = "delete from student "
					+ "where id = 4";
			result = statement.executeUpdate(query);
			System.out.println
			("Query OK, " + result + " row(s) affected.");
			
			// Display all records using static query
						query = "select * from student";
						resultSet = statement.executeQuery(query);
						while (resultSet.next()) {
							System.out.println(resultSet.getString(1) + " | " 
									+ resultSet.getString(2) + " | "
									+ resultSet.getString(3) + " | " 
									+ resultSet.getString(4));
						}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}
		}
	}

}
