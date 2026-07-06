// -- Custom Unchecked Exception -- //

// Class for custom unchecked exception
  // Extending 'RuntimeException' makes this an Unchecked Exception. The compiler does NOT force you to handle this at compile-time.
class InsufficientBalanceException extends RuntimeException {
  public InsufficientBalanceException(String message) {
    // Passes the error message to the parent RuntimeException class
    super(message);
  }
}

// Implementation Class for custom unchecked exception
public class Custom_Unchecked_Exception {
  // The 'throws' keyword is OPTIONAL here. Even without it, the program will compile because it is an Unchecked Exception.
  static void withdraw(int amount) {
    int balance = 100;
    if (amount > balance) {
      // 'throw' creates and triggers the exception. If not caught, this will terminate the program at runtime.
      throw new InsufficientBalanceException("Error: Insufficient funds in your account.");
    }
    System.out.println("Withdrawal successful! Remaining balance: " + (balance - amount));
  }

  // MAIN Method Class
  public static void main(String[] args) {
    // We use try-catch here by choice
    try {
      withdraw(150);
    } catch (InsufficientBalanceException e) {
      // Retrieves and prints the custom message we defined in the withdraw method
      System.out.println("Caught Unchecked Exception: " + e.getMessage());
    }
  }
}
