import java.sql.*;

public class SubqueryExample {
    public static void main(String[] args) {

        try {
            // Create statement
            try ( // PostgreSQL connection
                    Connection con = DriverManager.getConnection(
                            "jdbc:postgresql://localhost:5432/Test", "postgres", "jaanu0214"
                    )) {
                // Create statement
                Statement stmt = con.createStatement();
                
                // Subquery
                String query = "SELECT * FROM employee WHERE salary > (SELECT AVG(salary) FROM employee)";
                
                // Execute query
                ResultSet rs = stmt.executeQuery(query);
                
                // Print result
                while (rs.next()) {
                    System.out.println(rs.getInt("emp_id") + " " + rs.getString("emp_name"));
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}