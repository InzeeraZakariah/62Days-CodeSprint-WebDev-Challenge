// -- Creating Thread using Runnable Interface -- //
  /* Runnable is a functional interface that has only 1 method, run().
  It is used to create a thread by implementing the Runnable interface and overriding the run() method. */

// Class 1 that implements Runnable to create a new thread
class A implements Runnable {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("A");
        }
    }
}

// Class 2 that implements Runnable to create another thread
class B implements Runnable {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("B");
        }
    }
}

// MAIN Method Class
public class Runnable_Interface {
    public static void main(String args[]) {
        Runnable obj1 = new A(); // Creating an object of class A
        Runnable obj2 = new B(); // Creating an object of class B

        Thread t1 = new Thread(obj1); // Creating a thread for class A
        Thread t2 = new Thread(obj2); // Creating a thread for class B

        t1.start(); // Starting thread for class A
        t2.start(); // Starting thread for class B
    }
}