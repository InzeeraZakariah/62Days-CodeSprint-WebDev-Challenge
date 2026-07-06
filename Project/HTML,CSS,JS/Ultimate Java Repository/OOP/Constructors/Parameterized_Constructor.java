// -- Parameterized Constructor -- //

// Parameterized Constructor - initializes object with provided values when parameters are passed
class Parameterized_Constructor {
    int id;
    String name;

    // Constructor to initialize the object
    Parameterized_Constructor(int i, String n) {
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
        Parameterized_Constructor obj1 = new Parameterized_Constructor(1, "Jack");
        Parameterized_Constructor obj2 = new Parameterized_Constructor(2, "Jill");
        obj1.display();
        obj2.display();
    }
}