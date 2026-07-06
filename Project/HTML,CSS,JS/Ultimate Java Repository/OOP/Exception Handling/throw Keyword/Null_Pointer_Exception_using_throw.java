// -- Null Pointer Exception using throw keyword -- //

public class Null_Pointer_Exception_using_throw {
    static void checkString(String str) {
        if (str == null) {
            throw new NullPointerException("Error: The string is null!");
        } else {
            System.out.println("The string is: " + str);
        }
    }

    // MAIN Method Class
    public static void main(String[] args) {
        checkString("Hello, World!"); // This will not throw an exception
        checkString(null); // This will throw a NullPointerException
    }
    
}
