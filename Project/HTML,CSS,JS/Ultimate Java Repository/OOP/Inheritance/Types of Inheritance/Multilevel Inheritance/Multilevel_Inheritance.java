// -- Multilevel Inheritance -- //

// SuperClass (Grandparent)
class Bird {
    void fly() {
        System.out.print("I am a bird");
    }
}

// SubClass (Parent, inherits from SuperClass)
class Parrot extends Bird {
    void speak() {
        System.out.println("I can speak");
    }
}

// Sub-SubClass (Child, inherits from SubClass)
class TalkingParrot extends Parrot {
    void dance() {
        System.out.println("I can dance");
    }
}

// MAIN Method Class
public class Multilevel_Inheritance {
    public static void main(String args[]) {
        TalkingParrot obj = new TalkingParrot();
        obj.dance(); // Child class method
        obj.speak(); // Parent class method
        obj.fly(); // Grandparent class method
    }
}