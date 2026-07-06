// -- Thread -- //

public class Single_Thread{
    public static void main (String[] args) {
        // Creating an object of the Thread class
        Thread t1 = new Thread("Thread number 1");
        Thread t2 = new Thread("Thread number 2");

        // Executing the threads using start method
        t1.start();
        t2.start();
        // Getting the names of the threads
        String name1 = t1.getName();
        String name2 = t2.getName();

        // Printing the names of the threads
        System.out.println(name1);
        System.out.println(name2);
    }
}