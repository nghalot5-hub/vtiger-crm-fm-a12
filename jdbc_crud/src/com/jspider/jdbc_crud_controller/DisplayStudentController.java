package com.jspider.jdbc_crud_controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DisplayStudentController {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;

		try {
			// step-1 load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "root";

			connection = DriverManager.getConnection(url, user, pass);

			System.out.println(connection);

			// step-3 create statement
			statement = connection.createStatement();

			// step-4 execute Query
			String displayStudentQuery = "select * from student";

			ResultSet resultSet = statement.executeQuery(displayStudentQuery);

			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");

				Date date=resultSet.getDate("dob");
				
				LocalDate localDate = date.toLocalDate();
				
				System.out.println("id = " + id);
				System.out.println("name = " + name);
				System.out.println("dob = "+localDate);

				
				System.out.println(".............................");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (statement != null && connection != null) {
					statement.close();
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
