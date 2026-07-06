// -- Multiplication_Table -- //

import java.io.IOException;
import java.util.Scanner;

class Multiplication_Table {
    public static void main(String[] args) throws IOException {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = scanner.nextInt();

        // while (condition)
        while (i <= 12) {
            System.out.println(no + " * " + i + " = " + (no * i));
            i++;
        }

        scanner.close();
    }
}
