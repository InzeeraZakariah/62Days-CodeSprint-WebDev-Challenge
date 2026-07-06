// -- NumberFormatException -- //

public class NumberFormatException_program {
  public static void main(String[] args) {
    try {
      String s = "Java";
      // Attempting to convert a non-numeric string into an integer
      int i = Integer.parseInt(s);
    } 
    catch (NumberFormatException e) {
      // Handles incompatible data type conversion errors
      System.out.println("NumberFormatException: For input string: \"Java\"");
    }
  }
}
