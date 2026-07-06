// -- Method Overriding using @Override -- //

// Parent Class
class College {
  // Method to be overridden
  void department() {
    System.out.println("General Department");
  }
}

// Child Class 1
class ComputerScience extends College {
  // Overriding parent method
  @Override 
  void department() {
    System.out.println("CS Department");
  }
}

// Child Class 2
class ME extends College {
  // Overriding parent method
  @Override
  void department() {
    System.out.println("ME Department");
  }
}

// MAIN Method Class
public class Method_Overriding {
  public static void main(String[] args) {
    // Reference of Parent class
    College c;

    // Object of Child class 1
    c = new ComputerScience();
    c.department();

    // Object of Child class 2
    c = new ME();
    c.department();
  }
}
