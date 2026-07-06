// -- Methods in Different Class -- //

// Class 1 with Methods
class Class1 {
    int rollNo;
    String name;

    // Method
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

// Class 2 to Access Methods
class Methods_in_Different_Class {
    // MAIN Method Class
    public static void main(String[] args) {
        // Accessing methods from Class 1
        Class1 s = new Class1();

        s.rollNo = 101;
        s.name = "Ravi";

        s.display();
    }
}