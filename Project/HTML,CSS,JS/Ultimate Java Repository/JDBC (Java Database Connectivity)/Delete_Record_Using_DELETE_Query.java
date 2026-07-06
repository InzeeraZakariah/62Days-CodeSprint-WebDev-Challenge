// -- Delete record in table based on a condition using DELETE query -- //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_Record_Using_DELETE_Query {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/q2", "root", "root");

            // DELETE query to delete a record in table based on a condition
            String query = "DELETE FROM employee WHERE emp_id = 105";
          
            Statement stmt = con.createStatement();

            stmt.executeUpdate(query);
            System.out.println("Record deleted successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
