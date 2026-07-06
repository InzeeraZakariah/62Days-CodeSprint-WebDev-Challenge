// -- CRUD Operations -- //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/q3";
        String user = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            int choice;

            do {
                System.out.println("\n--- Employee CRUD Menu ---");
                System.out.println("1. Insert Employee");
                System.out.println("2. Display Employees");
                System.out.println("3. Update Employee Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        // CREATE operation: Adding a new record to the database
                        System.out.print("Enter emp_id: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter department: ");
                        String dept = sc.nextLine();

                        System.out.print("Enter salary: ");
                        int sal = sc.nextInt();

                        String insertQuery = "INSERT INTO employees VALUES (?, ?, ?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insertQuery);
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, dept);
                        ps1.setInt(4, sal);

                        ps1.executeUpdate();
                        System.out.println("Employee inserted!");
                        break;

                    case 2:
                        // READ operation: Retrieving and displaying records from the database
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

                        System.out.println("\nEmpID   Name    Dept    Salary");
                        while (rs.next()) {
                            System.out.println(
                                rs.getInt(1) + "   " +
                                rs.getString(2) + "   " +
                                rs.getString(3) + "   " +
                                rs.getInt(4)
                            );
                        }
                        break;

                    case 3:
                        // UPDATE operation: Modifying an existing record in the database
                        System.out.print("Enter emp_id to update: ");
                        int uid = sc.nextInt();

                        System.out.print("Enter new salary: ");
                        int newSal = sc.nextInt();

                        String updateQuery = "UPDATE employees SET salary=? WHERE emp_id=?";
                        PreparedStatement ps2 = con.prepareStatement(updateQuery);
                        ps2.setInt(1, newSal);
                        ps2.setInt(2, uid);

                        ps2.executeUpdate();
                        System.out.println("Salary updated!");
                        break;

                    case 4:
                        // DELETE operation: Removing a specific record from the database
                        System.out.print("Enter emp_id to delete: ");
                        int did = sc.nextInt();

                        String deleteQuery = "DELETE FROM employees WHERE emp_id=?";
                        PreparedStatement ps3 = con.prepareStatement(deleteQuery);
                        ps3.setInt(1, did);

                        ps3.executeUpdate();
                        System.out.println("Employee deleted!");
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 5);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
