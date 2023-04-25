package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

	//Create constants below
	private static final String HOST = "localhost";
	private static final String PASSWORD = "projects";
	private static final int PORT = 3306;
	private static final String SCHEMA = "projects";
	private static final String USER = "projects";
	
	//method getConnection
	public static Connection getConnection() {
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER, PASSWORD);
	//Call DriverManager to obtain a connection	and generate try/catch method
		try {
			Connection conn = DriverManager.getConnection(uri);
			System.out.println("Connection to schema " + SCHEMA + " is succesful.");
			return conn;
		} catch (SQLException e) {
		  System.out.println("Unable to get connection at " + uri);	
		  throw new DbException("Unable to get connection at \" + uri"); 	
		}
	}
}
