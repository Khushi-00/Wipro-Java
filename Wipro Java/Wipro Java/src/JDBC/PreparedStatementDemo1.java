package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String dbURL = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "Khushi@25";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(dbURL, username, password);
        Statement st = con.createStatement();

        st.executeUpdate("CREATE DATABASE IF NOT EXISTS companydb");

        st.execute("USE companyydb");
        
        st.executeUpdate("DELETE FROM employees"); // Clears existing data

        String createTableSQL = """
            CREATE TABLE IF NOT EXISTS employees (
                id INT PRIMARY KEY,
                name VARCHAR(50),
                department VARCHAR(50),
                salary DOUBLE
            )
        """;
        st.executeUpdate(createTableSQL);

        String insertSQL = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
        PreparedStatement insertPS = con.prepareStatement(insertSQL);

        insertPS.setInt(1, 101);
        insertPS.setString(2, "Alice");
        insertPS.setString(3, "HR");
        insertPS.setDouble(4, 50000);
        insertPS.executeUpdate();

        insertPS.setInt(1, 102);
        insertPS.setString(2, "Bob");
        insertPS.setString(3, "IT");
        insertPS.setDouble(4, 65000);
        insertPS.executeUpdate();

        insertPS.setInt(1, 103);
        insertPS.setString(2, "Charlie");
        insertPS.setString(3, "Sales");
        insertPS.setDouble(4, 60000);
        insertPS.executeUpdate();

        System.out.println("Data inserted into employees table.\n");

        ResultSet rs = st.executeQuery("SELECT * FROM employees");
        System.out.println("All Employees:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + ", " + rs.getString("name") +
                    ", " + rs.getString("department") + ", " + rs.getDouble("salary"));
        }

        rs = st.executeQuery("SELECT * FROM employees WHERE id = 102");
        System.out.println("\nEmployee with ID 102:");
        while (rs.next()) {
            System.out.println(rs.getString("name") + ", " + rs.getString("department"));
        }

        st.executeUpdate("UPDATE employees SET salary = 70000 WHERE id = 102");

        st.executeUpdate("UPDATE employees SET department = 'Finance' WHERE name = 'Alice'");

        st.executeUpdate("DELETE FROM employees WHERE id = 103");

        st.executeUpdate("DELETE FROM employees WHERE department = 'Sales'");

        rs = st.executeQuery("SELECT * FROM employees");
        System.out.println("\nFinal Employee Data:");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + ", " + rs.getString("name") +
                    ", " + rs.getString("department") + ", " + rs.getDouble("salary"));
        }

        // Cleanup
        rs.close();
        st.close();
        insertPS.close();
        con.close();
    }
}
