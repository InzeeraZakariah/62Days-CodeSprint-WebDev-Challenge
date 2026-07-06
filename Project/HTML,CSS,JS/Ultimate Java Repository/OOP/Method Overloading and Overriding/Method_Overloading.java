// -- Method Overloading -- //
  // Allows a class to have more than 1 method with the same name, provided their parameter lists (type, number, or sequence) are different.

class Method_Overloading {

    // Method with 2 integer parameters
    void add(int a, int b) {
        System.out.println("Sum of two: " + (a + b));
    }

    // Overloaded method with 3 integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three: " + (a + b + c));
    }

    // Overloaded method with double data types
    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }
    
    // MAIN Method Class
    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();

        // Calling different versions of the add method
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
    }
}
