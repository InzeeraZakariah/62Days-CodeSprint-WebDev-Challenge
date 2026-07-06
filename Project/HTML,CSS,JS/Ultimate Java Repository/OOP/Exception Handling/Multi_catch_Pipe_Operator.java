// -- Multi-Catch (Pipe Operator) -- //

import java.io.IOException;
import java.sql.SQLException;

public class Multi_catch_Pipe_Operator {
  public static void main(String[] args) {
    try {
      simulateError();
    } 
    // Using the pipe '|' to catch multiple types in one block
    catch (IOException | SQLException ex) {
      System.out.println("Handled: " + ex.getClass().getSimpleName());
    }
  }

  static void simulateError() throws SQLException {
    throw new SQLException("Database connection failed");
  }
}
