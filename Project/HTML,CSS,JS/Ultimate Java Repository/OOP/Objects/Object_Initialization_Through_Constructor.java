// -- Object Initialization Through Constructor -- //

class Object_Initialization_Through_Constructor {
    int id;
    String name;

    // Constructor to initialize the object
    Object_Initialization_Through_Constructor() {
        id = 101;
        name = "John";
    }

    // Method to display object details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // MAIN Method
    public static void main(String[] args) {
        Object_Initialization_Through_Constructor obj1 = new Object_Initialization_Through_Constructor();
        Object_Initialization_Through_Constructor obj2 = new Object_Initialization_Through_Constructor();
        obj1.display();
        obj2.display();
    }
}