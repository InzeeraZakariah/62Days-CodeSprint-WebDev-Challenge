// -- StringIndexOutOfBoundsException -- //

public class StringIndexOutOfBoundsException_program {
  public static void main(String[] args) {
    try {
      String s1 = "I am learning Java.";
      // Attempting to access index 32 when string length is only 19
      System.out.println(s1.substring(32));
    } 
    catch (StringIndexOutOfBoundsException e) {
      // Handles cases where requested index exceeds string length
      System.out.println("StringIndexOutOfBoundsException: begin 32, end 19, length 19");
    }
  }
}
