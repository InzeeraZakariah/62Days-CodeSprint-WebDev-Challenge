// -- Insert data/record into table using INSERT query -- //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Data_Using_INSERT_Query {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/q2", "root", "root");
          
            // INSERT query to insert record/data into table
            String query = "INSERT INTO employee VALUES (105, 'Meena', 'IT', 52000)";
            
            Statement stmt = con.createStatement();

            stmt.executeUpdate(query);
            System.out.println("Record inserted successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
