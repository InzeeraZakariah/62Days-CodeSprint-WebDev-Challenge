// -- Object Initialization Through Copy Constructor -- //

class Object_Initialization_Through_Copy_Constructor {
    int id;
    String name;

    // Parameterized Constructor to initialize the object
    Object_Initialization_Through_Copy_Constructor(int i, String n) {
        id = i;
        name = n;
    }

    // Copy Constructor to create a new object as a copy of an existing object
    Object_Initialization_Through_Copy_Constructor(Object_Initialization_Through_Copy_Constructor obj) {
        id = obj.id;
        name = obj.name;
    }

    // Method to display object details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // MAIN Method
    public static void main(String[] args) {
        Object_Initialization_Through_Copy_Constructor obj1 = new Object_Initialization_Through_Copy_Constructor(1, "Alice");
        Object_Initialization_Through_Copy_Constructor obj2 = new Object_Initialization_Through_Copy_Constructor(obj1); // Using copy constructor
        obj1.display();
        obj2.display();
    }
}