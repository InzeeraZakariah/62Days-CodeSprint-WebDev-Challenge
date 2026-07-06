// -- SQLException -- //

import java.sql.SQLException;

public class SQLException_program {
  public static void main(String[] args) {
    try {
      simulateDatabaseError();
    } 
    catch (SQLException e) {
      // Redirects to catch block to continue further execution
      System.out.println("Caught Checked SQLException: " + e.getMessage());
    }
  }

  static void simulateDatabaseError() throws SQLException {
    throw new SQLException("Database connection failed.");
  }
}
