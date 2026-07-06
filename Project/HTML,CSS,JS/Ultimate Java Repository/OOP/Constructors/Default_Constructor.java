// -- Default Constructor -- //

// Default Constructor - initializes object with default values when no parameters are provided
class Default_Constructor {
    int id;
    String name;

    // Default Constructor (No-argument constructor)
    Default_Constructor() {
        this.id = 0;
        this.name = "Unknown";
        System.out.println("Default Constructor called!");
    }

    // Method to display object details
    void display() {
        System.out.println("ID: " + id + " | Name: " + name);
    }

    // MAIN Method
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Default_Constructor obj1 = new Default_Constructor();
        Default_Constructor obj2 = new Default_Constructor();

        System.out.println("\nObject 1 Details:");
        obj1.display();

        System.out.println("\nObject 2 Details:");
        obj2.display();
    }
}