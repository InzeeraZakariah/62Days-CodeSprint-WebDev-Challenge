// -- Multiple Threads -- //

// Class that extends Thread to create a new thread
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        }
    }

    // MAIN Method Class
    public class Multiple_Threads {
        public static void main(String[] args) {
            MyThread t1 = new MyThread(); // Creating a thread object
            t1.run(); // Runs in the main thread - Calling run method directly (not recommended)
            t1.start(); // Runs in a new thread

            MyThread t2 = new MyThread(); // Creating another thread object
            t2.start(); // Runs in a new thread
        }
    }
}
