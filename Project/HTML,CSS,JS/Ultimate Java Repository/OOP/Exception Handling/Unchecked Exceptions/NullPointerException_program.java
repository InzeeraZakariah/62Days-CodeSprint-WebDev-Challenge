// -- NullPointerException -- //

public class NullPointerException_program {
  public static void main(String[] args) {
    try {
      String s = null;
      // Attempting to invoke a method on a null reference
      System.out.println(s.length()); 
    } 
    catch (NullPointerException e) {
      // Provides a solution or alternative for the exception
      System.out.println("Error: Null reference used where an object is required.");
    }
  }
}
