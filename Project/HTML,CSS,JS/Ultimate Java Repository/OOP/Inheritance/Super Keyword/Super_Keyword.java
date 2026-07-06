// -- Super_Keyword -- //

// Parent/Super Class
class School {
    int id;
    String name = "ABC School";
}

// Child Class
class Teacher extends School {
    int id;
    String name = "Teacher Class"; // Local to Teacher
    
    void printSchoolName() {
        // Variable in current class
        System.out.println("Current Class name: " + name); // Output: "Teacher Class"
        
        // Variable in parent/super class - using super.variable
        System.out.println("Super Class school name: " + super.name);
    }
}

// MAIN Method Class
public class Super_Keyword {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.printSchoolName(); // Calling parent/super class method to print variable in child and super class
        // Output:
        // Current Class name: Teacher Class
        // Super Class school name: ABC School
    }
}