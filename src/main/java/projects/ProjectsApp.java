package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

public class ProjectsApp {
//create connection
	public static void main(String[] args) {
		DbConnection.getConnection();

	}

}
