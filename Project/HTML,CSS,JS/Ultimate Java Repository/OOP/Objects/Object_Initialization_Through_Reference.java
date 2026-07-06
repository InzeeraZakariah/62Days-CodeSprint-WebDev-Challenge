// -- Object Initialization Through Reference -- //

// Class Definition
class Student {
    int id;
    String name;
}

// MAIN Method
public class Object_Initialization_Through_Reference {
    public static void main(String[] args) {
        // Creating the object
        Student obj = new Student();

        // Initializing through reference variables
        obj.id = 101;
        obj.name = "John";

        // Displaying the data
        System.out.println("ID: " + obj.id);
        System.out.println("Name: " + obj.name);
    }
}