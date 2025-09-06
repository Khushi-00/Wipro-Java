package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HandlingResultSets {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// fetch the db url, password and username of the my sql db
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";

		String username = "root";
		String password = "Khushi@25";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		Statement st = con.createStatement();
		
		String selectquery = "select * from customer;";
		
		ResultSet rs = st.executeQuery(selectquery);
		
		while (rs.next()) {
			
			System.out.println(rs.getString("customer_id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("city"));
			System.out.println(rs.getString("grade"));
			System.out.println(rs.getString("salesman_id"));
		}
		
	}
	
}
