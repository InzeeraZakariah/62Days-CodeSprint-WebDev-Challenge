// -- try-catch Block -- //

public class try_catch_Block {
  public static void main(String[] args) {
    // try Block
    try {
      // Code that can raise an exception
      int div = 509 / 0; 
    }
    // catch Block
    catch (ArithmeticException e) {
      // Handle specific exception
      System.out.println("Exception: " + e);
    }
    System.out.println("End of code");
  }
}
