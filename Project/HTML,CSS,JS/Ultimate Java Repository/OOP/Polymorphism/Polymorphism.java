// -- Polymorphism -- //

// Class demonstrating compile-time polymorphism (Method Overloading)
class CompileTime {
    // Method with 1 parameter
    public static int perimeter(int side) {
        return 4 * side;
    }

    // Overloaded method with 2 parameters
    public static int perimeter(int length, int width) {
        return 2 * (length + width);
    }
}

// Class demonstrating runtime polymorphism (Method Overriding)
public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism demonstration
        System.out.println("Perimeter of square will be: " + CompileTime.perimeter(4));
        System.out.println();
        System.out.println("Perimeter of rectangle will be: " + CompileTime.perimeter(7, 14));
    }
}