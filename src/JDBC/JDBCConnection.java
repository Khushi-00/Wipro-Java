package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// fetch the db url, password and username of the my sql db
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";

		String username = "root";
		String password = "Khushi@25";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		Statement st = con.createStatement();
		
		String selectquery = "select * from persons;";
		
		ResultSet rs = st.executeQuery(selectquery);
		
		while (rs.next()) {
			
			System.out.println(rs.getString("PersonID"));
			System.out.println(rs.getString("FirstName"));
			System.out.println("LastName");
		}
	
	}

}
