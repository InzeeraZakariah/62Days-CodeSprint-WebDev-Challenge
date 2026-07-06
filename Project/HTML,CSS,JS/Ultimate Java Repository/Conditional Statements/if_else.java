// -- if-else statement -- //

import java.util.Scanner;

class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int intVal = scanner.nextInt();

        if (intVal < 0) {
            System.out.println("Number is negative");
        } else if (intVal > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is 0");
        }

        scanner.close();
    }
}

