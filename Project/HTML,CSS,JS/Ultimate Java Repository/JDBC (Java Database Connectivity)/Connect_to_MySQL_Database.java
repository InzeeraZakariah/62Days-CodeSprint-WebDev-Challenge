// -- Establish Connection with MySQL Database -- //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect_to_MySQL_Database {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root"; // Must be 'root'
        String password = "your_password";  // Change to your MySQL password

        try {
            // Load Driver (optional in new versions, but good for exams)
            Class.forName("com.mysql.cj.jdbc.Driver");
          
            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully!");
          
            // Create Statement
            Statement stmt = con.createStatement();
            
            // Insert Data
            String sql = "INSERT INTO student VALUES (1, 'Sam', 90)";
            stmt.executeUpdate(sql);
            System.out.println("Data Inserted Successfully!");
            
            // Close Connection
            con.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
