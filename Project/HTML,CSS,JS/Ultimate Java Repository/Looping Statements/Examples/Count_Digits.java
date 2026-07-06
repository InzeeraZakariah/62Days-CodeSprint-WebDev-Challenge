package Examples;
import java.io.IOException;
import java.util.Scanner;

class Count_Digits {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = scanner.nextInt();

        int count = 0;

        // while (condition)
        while (no != 0) {
            no = no / 10;
            count++;
        }
        System.out.println("Number of digits = " + count);

        scanner.close();
    }
}
