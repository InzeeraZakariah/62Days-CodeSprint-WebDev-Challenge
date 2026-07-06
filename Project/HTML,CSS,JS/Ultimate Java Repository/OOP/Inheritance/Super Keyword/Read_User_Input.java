// -- Super Keyword - Reading User Inputs -- //

import java.util.Scanner;

// Parent/Super Class
class Employee {
    int basicSalary;
    // Parent Constructor - Initializes basicSalary, assigns it to Employee object's memory
    Employee(int salary) {
        basicSalary = salary;
    }
}

// Child Class
class Manager extends Employee {
    int bonus;

    // Child Constructor using super - Calls parent constructor to initialize salary, then initializes bonus
    Manager(int salary, int b) {
        super(salary); // Passes salary to Parent Class constructor
        bonus = b;
    }
    
    // Method to calculate actual salary
    void calculateAndDisplay() {
        int actualSalary = super.basicSalary + bonus;
        System.out.println("\n-- Salary Statement --");
        System.out.println("Basic Salary: " + super.basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Actual Salary: " + actualSalary);
    }
}

// MAIN Method Class
public class Read_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading inputs
        System.out.println("Enter Basic Salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter Bonus: ");
        int bonus = sc.nextInt();

        // Initializing the object through the Constructor
        Manager m = new Manager(salary, bonus);
        
        // Calling method to perform calculation and display
        m.calculateAndDisplay();

        sc.close();
    }
}