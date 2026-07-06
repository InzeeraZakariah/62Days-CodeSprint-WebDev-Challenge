package Examples;
// -- Example - Devices -- //

// SuperClass (Grandparent)
class Device {
    void screen() {
        System.out.print("I have a screen");
    }
}

// SubClass (Parent, inherits from SuperClass)
class SmartDevice extends Device {
    void connect() {
        System.out.println("I can connect to the Internet");
    }
}

// Sub-SubClass (Child, inherits from SubClass)
class SmartPhone extends SmartDevice {
    void call() {
        System.out.println("I can call");
    }
}

// MAIN Method Class
public class Example_Devices {
    public static void main(String args[]) {
        SmartPhone obj = new SmartPhone();
        obj.call(); // Child class method
        obj.connect(); // Parent class method
        obj.screen(); // Grandparent class method
    }
}