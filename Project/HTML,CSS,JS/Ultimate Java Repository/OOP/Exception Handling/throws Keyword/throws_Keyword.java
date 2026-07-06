// -- throws Keyword -- //

public class throws_Keyword {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            System.out.println("Arithmetic error");
        } else {
            System.out.println("Access granted - You are eligible for    voting.");
        }
    }

    // MAIN Method Class
    public static void main(String[] args) {
        checkAge(14); // This will throw an exception
    }
}