// -- Abstract Class -- //

// Parent abstract class
abstract class ParentClass {
    String parentName = "Parent";
    abstract void department();
    void show() {
        System.out.println("Parent class: "   + parentName);
    }
}

// Subclass that extends the abstract class
class SubClass1 extends ParentClass {
    // Override the abstract method
    @Override
    void department() {
        System.out.println("Department: Science");
  }
}

// Another subclass that extends the abstract class
class SubClass2 extends ParentClass {
    // Override the abstract method
    @Override
    void department() {
        System.out.println("Department: Commerce");
  }
}

// Main class - tests the abstract class and its subclasses
public class Abstract_Class {
    // MAIN Method Class
    public static void main(String[] args) {
        SubClass1 obj1 = new SubClass1();

        System.out.println("--- SubClass1 Details ---");
        obj1.show(); // Inherited method
        obj1.department(); // Overridden method

        SubClass2 obj2 = new SubClass2();

        System.out.println("\n--- SubClass2 Details ---");
        obj2.show(); // Inherited method
        obj2.department(); // Overridden method
    }
}






