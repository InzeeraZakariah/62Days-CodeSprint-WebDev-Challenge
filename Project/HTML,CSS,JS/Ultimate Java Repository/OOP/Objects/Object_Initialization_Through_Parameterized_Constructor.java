// -- Object Initialization Through Parameterized Constructor -- //

class Object_Initialization_Through_Parameterized_Constructor {
    int id;
    String name;

    // Constructor to initialize the object
    Object_Initialization_Through_Parameterized_Constructor(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display object details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // MAIN Method
    public static void main(String[] args) {
        Object_Initialization_Through_Parameterized_Constructor obj1 = new Object_Initialization_Through_Parameterized_Constructor(1, "Jack");
        Object_Initialization_Through_Parameterized_Constructor obj2 = new Object_Initialization_Through_Parameterized_Constructor(2, "Jill");
        obj1.display();
        obj2.display();
    }
}