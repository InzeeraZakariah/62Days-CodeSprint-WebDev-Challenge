// -- Exception handling with multiple try statements -- //

class Multiple_try_Blocks {
    public static void main(String args[]) {
        System.out.println("Handling Exceptions with Multiple try Statements\n");
        
        // 1st try block
        try {
            // code should raise the exception
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
            // 2nd try block
            try {
                // the code should raise an exception
                String str = null;
                System.out.println(str.length());
                // 3rd try block
                try {
                    String num = "abc";
                    int number = Integer.parseInt(num);
                    System.out.println("Number: " + number);
                }

                // Catch block for 3rd try block
                catch (NumberFormatException e) {
                    System.out.println("NumberFormatException: 3rd try block");
                }
            }
            // Catch block for 2nd try block
            catch (NullPointerException e) {
                System.out.println("NullPointerException: 2nd try block");
            }
        }
        // Catch block for 1st try block
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: 1st try block");
        }

        // Program continues after handling exceptions
        System.out.println("Program continues after handling exceptions.");
    }
}
