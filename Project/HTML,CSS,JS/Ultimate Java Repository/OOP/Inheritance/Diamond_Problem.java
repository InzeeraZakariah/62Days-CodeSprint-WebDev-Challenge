// -- Diamond Problem -- //
/* The Diamond Problem occurs in multiple inheritance when two classes inherit from the same base class and a third class inherits from both of them.
This can lead to ambiguity because the third class may not know which version of the method to call from the base class.
In Java, this problem is resolved using interfaces, as they allow multiple inheritance without ambiguity.
*/

// Base class
interface Vehicle {
    default void start() {
        System.out.print("Vehicle starting");
    }
}

// Subclass 1
interface Car extends Vehicle {
    default void start() {
        System.out.println("Car starting");
    }
}

// Subclass 2 (Inherits from Vehicle)
interface Bike extends Vehicle {
    default void start() {
        System.out.println("Bike starting");
    }
}

// Subclass 3 (Child, inherits from both Car and Bike)
interface HybridVehicle extends Car, Bike {
    default void start() {
        System.out.println("Hybrid Vehicle starting");
        Car.super.start(); 
        Bike.super.start(); 
    }
}

// Main class to test the Diamond Problem
public class Diamond_Problem {
    // MAIN Method Class
    public static void main(String[] args) {
        HybridVehicle obj = new HybridVehicle() {};
        obj.start(); // Calls the overridden start method in HybridVehicle
    }
}