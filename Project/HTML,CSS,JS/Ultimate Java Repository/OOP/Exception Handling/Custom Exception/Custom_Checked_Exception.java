// -- Custom Checked Exception -- //

// Class for custom checked exception
  // Extending 'Exception' makes this a Checked Exception. The compiler will now verify that this is handled wherever it's used.
class InvalidMarksException extends Exception {
  public InvalidMarksException(String message) {
    // Passes the error message to the parent Exception class constructor
    super(message);
  }

// Implementation Class for custom checked exception
public class Custom_Checked_Exception {
  // The 'throws' keyword is MANDATORY in the method signature.
  // It warns the compiler that this method might result in a Checked Exception.
  static void validate(int marks) throws InvalidMarksException {
    if (marks < 0 || marks > 100) {
      // 'throw' creates a new instance of our custom exception and "fires" it
      throw new InvalidMarksException("Error: Marks must be between 0 and 100.");
    }
    System.out.println("Marks are valid: " + marks);
  }

  // MAIN Method Class
  public static void main(String[] args) {
    try {
      // Since validate() throws a Checked Exception, we MUST use a try block
      validate(-5);
    } catch (InvalidMarksException e) {
      // This block "catches" the object we threw and retrieves the message
      System.out.println("Caught Checked Exception: " + e.getMessage());
    }
  }
}
