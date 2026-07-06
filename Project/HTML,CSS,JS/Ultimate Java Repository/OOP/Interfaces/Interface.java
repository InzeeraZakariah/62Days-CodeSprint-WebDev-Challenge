// -- Interface -- //

// Interface 1 that contains a method declaration without a body (abstract method)
interface Car {
    void start();
}

// Interface 2 that contains a method declaration without a body (abstract method)
interface Vehicle {
    void start();
    void fuelType();
}

// Interface that implements multiple interfaces (1 and 2)
class HybridCar implements Car, Vehicle {

    public void start() {
        System.out.println("Hybrid Car starting...");
    }

    public void fuelType() {
        System.out.println("Fuel type: Petrol + Electric");
    }
}

// MAIN Method Class
public class Interface {
    public static void main(String[] args) {
        
        // Creating an instance of the implementation class
        HybridCar h = new HybridCar();
        h.start(); // Calls method from interface 1
        h.fuelType(); // Calls method from interface 2

        // Using Interface reference for Polymorphism
        System.out.println("--- Using Interface References ---");
        
        Car c = h; // Creating object of class 1 using reference of interface 1
        c.start(); // Calls method from interface 1

        Vehicle v = h; // Creating object of class 1 using reference of interface 2
        v.start(); // Calls method from interface 1
        v.fuelType(); // Calls method from interface 2
    }
}
