// -- Array of Objects -- //

class Student {
    Student(int id, String name) {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Array_Of_Objects {
    // MAIN Method
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Alice");
        students[1] = new Student(2, "Bob");
        students[2] = new Student(3, "Charlie");
    }
}