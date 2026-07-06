// -- Multiple Exceptions -- //

public class Multiple_Exceptions {
    public static void main(String[] args) {

        System.out.println("Handling Multiple Exceptions in Java\n");

        // ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: String is null");
        }

        //  NumberFormatException
        try {
            String num = "abc";
            int number = Integer.parseInt(num);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index");
        }

        // StringIndexOutOfBoundsException
        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid string index");
        }

        System.out.println("Program continues after handling all exceptions.");
    }
}