// -- Update/modify record in table based on a condition using UPDATE query -- //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Modify_Data_Using_UPDATE_Query {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/q2", "root", "root");

            // UPDATE query to update/modify record in table based on a condition
            String query = "UPDATE employee SET salary = 60000 WHERE emp_id = 105";

            Statement stmt = con.createStatement();

            stmt.executeUpdate(query);
            System.out.println("Record updated successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
