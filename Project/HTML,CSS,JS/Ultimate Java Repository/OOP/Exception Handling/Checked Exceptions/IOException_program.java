// -- IOException -- //

import java.io.IOException;

public class IOException_program {
  public static void main(String[] args) {
    try {
      simulateFileError();
    } 
    catch (IOException e) {
      // Handles the parent class exception or generated type
      System.out.println("Caught Checked IOException: " + e.getMessage());
    }
  }

  static void simulateFileError() throws IOException {
    throw new IOException("File not found or inaccessible.");
  }
}
