// -- Switch Case -- //

import java.io.IOException;
import java.util.Scanner;

class switch_case {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int no1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int no2 = scanner.nextInt();

        System.out.println("Enter your choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        // switch(expression)
        switch (choice) {
            // case statements
            case 1:
                System.out.println("Addition = " + (no1 + no2));
                break;

            case 2:
                System.out.println("Subtraction = " + (no1 - no2));
                break;

            case 3:
                System.out.println("Multiplication = " + (no1 * no2));
                break;

            case 4:
                if (no2 != 0) {
                    System.out.println("Division = " + (no1 / no2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        // Closing the scanner object
        scanner.close();
    }
}
