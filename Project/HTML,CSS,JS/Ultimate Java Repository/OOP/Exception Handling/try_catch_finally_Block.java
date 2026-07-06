// -- try-catch-finally Block -- //

public class try_catch_finally_Block {
  public static void main(String[] args) {
    // try Block
    try {
      int div = 509 / 0;
    }
    // catch Block
    catch (ArithmeticException e) {
      System.out.println("Caught: " + e.getMessage());
    }
    // finally Block
    finally {
      // This block executes regardless of an exception
      System.out.println("Finally block: This always executes.");
    }
  }
}
