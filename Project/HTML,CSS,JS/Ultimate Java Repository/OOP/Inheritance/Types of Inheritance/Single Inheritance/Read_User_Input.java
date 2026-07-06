// -- Single Inheritance - Accepting User Input -- //

import java.util.Scanner;

// Parent Class/Base Class
class Course {
    String courseName;
    int duration;

    void showCourseDetails() {
        System.out.println("Name: " + courseName + " Duration: " + duration);
    }
}

// Derived Class/Sub Class
class ProgrammingCourse extends Course {
    String language;

    void showProgrammingDetails() {
        System.out.println("Name: " + courseName + " Duration: " + duration + " Language: " + language);
    }
}

// MAIN Method Class
class Read_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProgrammingCourse obj = new ProgrammingCourse();

        // Accepting Inputs
        System.out.print("Enter Course Name: ");
        obj.courseName = sc.nextLine();

        System.out.print("Enter Duration (in months/hours): ");
        obj.duration = sc.nextInt();
        
        // Consume the leftover newline character
        sc.nextLine(); 

        System.out.print("Enter Language: ");
        obj.language = sc.nextLine();

        System.out.println("\n--- Course Details ---");
        obj.showProgrammingDetails();
        obj.showCourseDetails();
        
        sc.close();
    }
}