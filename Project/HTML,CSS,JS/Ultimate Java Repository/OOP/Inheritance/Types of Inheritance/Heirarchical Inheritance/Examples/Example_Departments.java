// -- Example - Departments -- //

// Base class
class CA {
    String department = "Computer Applications";

    void displayCA() {
        System.out.println("Welcome to the Department of " + department);
    }
}

// Subclass 1
class BCA extends CA {
    int durationYears = 3;

    void displayBCA() {
        System.out.println("Program Duration: " + durationYears + " years");
    }
}

// Subclass 2
class MCA extends CA {
    String specialization = "Data Science";

    void displayMCA() {
        System.out.println("Specialization: " + specialization);
    }
}

public class Example_Departments {
    public static void main(String args[]) {
        BCA bcaObj = new BCA();
        MCA mcaObj = new MCA();

        // Accessing base class and own methods via BCA object
        System.out.println("--- BCA Details ---");
        bcaObj.displayCA(); // Inherited
        bcaObj.displayBCA(); // Own

        System.out.println("\n--- MCA Details ---");
        // Accessing base class and own methods via MCA object
        mcaObj.displayCA(); // Inherited
        mcaObj.displayMCA(); // Own
    }
}