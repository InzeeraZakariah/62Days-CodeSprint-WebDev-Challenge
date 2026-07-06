// -- Constructors in Abstract Class -- //

// Abstract class with a constructor
abstract class ParentClass {
    protected final String P;

    // Constructor
    ParentClass(String P) {
        this.P = P;
    }
}

// Subclass that extends the abstract class
public class Constructors_In_Abstract_Class extends ParentClass {
    public void display(String str) {
        System.out.println("Parent Name: " + P);
        System.out.println("Message: " + str);
    }

    // Constructor for the Main class
    Constructors_In_Abstract_Class(String P) {
        super(P); // Call the constructor of the abstract class
    }

    // MAIN Method Class
    public static void main(String[] args) {
        Constructors_In_Abstract_Class obj = new Constructors_In_Abstract_Class("Parent");
        obj.display("Hello from the Main class!");
    }
}