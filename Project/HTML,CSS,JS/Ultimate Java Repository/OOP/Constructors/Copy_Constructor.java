// -- Copy Constructor -- //

// Copy Constructor to create a new object as a copy of an existing object
class Copy_Constructor {
    int id;
    String name;

    // Parameterized Constructor to initialize the object
    Copy_Constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor to create a new object as a copy of an existing object
    Copy_Constructor(Copy_Constructor obj) {
        this.id = obj.id;
        this.name = obj.name;
    }

    // Method to display object details
    void display() {
        System.out.println("ID: " + id + " | Name: " + name);
    }

    // MAIN Method
    public static void main(String[] args) {
        // Original Object
        Copy_Constructor obj1 = new Copy_Constructor(1, "Alice");
        
        // New Object initialized using the copy constructor
        Copy_Constructor obj2 = new Copy_Constructor(obj1); 

        System.out.println("Original Object:");
        obj1.display();

        System.out.println("Copied Object:");
        obj2.display();
    }
}