// -- ArithmeticException -- //

public class ArithmeticException_program {
  public static void main(String[] args) {
    try {
      // Code that can raise exception
      int div = 509 / 0;
    } 
    catch (ArithmeticException e) {
      // Occurs when an exceptional arithmetic condition has occurred
      System.out.println("Arithmetic Exception occurs: " + e);
    }
  }
}
