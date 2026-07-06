// -- Variables -- //

class Variables {
    
    // Static Variable
      // Shared among all instances of the class
    static String collegeName = "ABC College";

    // Instance Variables
      // Non-static variables that belong to each instance of the class
    int id;
    String name;

    Variables(int sId, String sName) {
        id = sId;
        name = sName;
    }

    void display() {
        // Local Variable
          // Declared inside a method and can only be used within that method
        int passingScore = 40; 
        
        System.out.println("College: " + collegeName); // Accessing Static Variable
        System.out.println("ID: " + id + " | Name: " + name); // Accessing Instance Variables
        System.out.println("Passing Score: " + passingScore); // Accessing Local Variable
    }

    public static void main(String[] args) {
        // Creating an instance of Variables class
        Variables s1 = new Variables(101, "Riya");
        s1.display();

        // Changing Static Variable
        Variables.collegeName = "XYZ University";
        s1.display();
    }
}