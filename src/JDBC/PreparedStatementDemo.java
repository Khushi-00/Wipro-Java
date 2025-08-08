package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "Khushi@25";

		// Load MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish Connection
		Connection con = DriverManager.getConnection(dbURL, username, password);

		// Prepare SQL query with placeholder
		String query = "SELECT * FROM persons WHERE FirstName = ?";

		// Create PreparedStatement object
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "Ayush");

		// Execute the query
		ResultSet rs = ps.executeQuery();

		// Process the results
		while (rs.next()) {
			System.out.println("FirstName: " + rs.getString("FirstName"));
			System.out.println("LastName: " + rs.getString("LastName"));
		}
		
		//execute the select with two parameter
		
		String query1 = "select * from persons where FirstName = 'Ayush' and PersonId='1238'";
		String query2 = "select * from persons where FirstName = ? and PersonId= ?";
		
		PreparedStatement ps1 = con.prepareStatement(query2);
		
		ps1.setString(1, "Ayush");
		ps1.setInt(2,1238);
		
		ResultSet rs1 = ps1.executeQuery();
		
		while (rs1.next()) {
			
			System.out.println(rs1.getString("Address"));
			System.out.println(rs1.getString("LastName"));
			System.out.println(rs1.getString("City"));
		}

		// Close resources
		rs.close();
		ps.close();
		con.close();
	}
}
