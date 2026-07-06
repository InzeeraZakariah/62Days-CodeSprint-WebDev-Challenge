// -- Class with Modified Copy Constructor -- //

class Modified_Copy_Constructor {
    int facultyId;
    String facultyName;
    String program;
    String course;

    // Standard Parameterized Constructor
    Modified_Copy_Constructor(int i, String n, String p, String c) {
        facultyId = i;
        facultyName = n;
        program = p;
        course = c;
    }

    // Modified Copy Constructor: Takes an existing object + some new values
    Modified_Copy_Constructor(Modified_Copy_Constructor obj, int newId, String newName) {
        this.facultyId = newId;       // New ID
        this.facultyName = newName;   // New name
        this.program = obj.program;
        this.course = obj.course;
    }

    void display() {
        System.out.println("ID: " + facultyId + " | Name: " + facultyName + " | Program: " + program + " | Course: " + course);
    }

    public static void main(String[] args) {
        // Original object
        Modified_Copy_Constructor obj1 = new Modified_Copy_Constructor(1, "Alice", "Medicine", "Biology");

        // Copy constructor with different values
        Modified_Copy_Constructor obj2 = new Modified_Copy_Constructor(obj1, 2, "Bob"); 

        System.out.println("Faculty 1");
        obj1.display();

        System.out.println("Faculty 2");
        obj2.display();
    }
}