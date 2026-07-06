// -- Methods in Single Class -- //

// Single Class with Methods
class Methods_in_Single_Class {
    int rollNo;
    String name;

    // Method
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    // MAIN Method Class
    public static void main(String[] args) {
        Methods_in_Single_Class s = new Methods_in_Single_Class();
        
        // Accessing Variables
        s.rollNo = 101;
        s.name = "Ravi";
        
        // Accessing Method
        s.display();
    }
}