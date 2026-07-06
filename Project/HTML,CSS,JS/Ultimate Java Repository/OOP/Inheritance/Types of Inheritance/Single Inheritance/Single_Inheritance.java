// -- Single Inheritance -- //

// SuperClass (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// SubClass (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog says: Woof woof");
    }
}

// MAIN Method Class
public class Single_Inheritance {
    public static void main(String args[]) {
        Dog obj = new Dog();
        
        obj.bark();  // Subclass method (Specific to Dog)
        obj.eat();   // Inherited method (From Animal Class)
    }
}
