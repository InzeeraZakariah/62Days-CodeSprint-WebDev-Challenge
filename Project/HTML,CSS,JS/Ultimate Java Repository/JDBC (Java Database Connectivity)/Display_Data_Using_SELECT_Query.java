// -- Display table data/records using SELECT query -- //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display_Data_Using_SELECT_Query {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/q2", "root", "your_password");

            Statement stmt = con.createStatement();
            
            // SELECT query to display records/data in the table
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3) + " " +
                    rs.getInt(4)
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
