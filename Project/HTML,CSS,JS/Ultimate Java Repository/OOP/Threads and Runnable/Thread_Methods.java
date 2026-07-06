// -- Thread Methods -- //

public class Thread_Methods extends Thread {

  // run() - Contains the actual code executed by the thread
  @Override
  public void run() {
    try {
      System.out.println(getName() + " is now running.");
      // sleep() - Stops the thread for the specified time (500 milliseconds)
      Thread.sleep(500);
      System.out.println(getName() + " has finished sleeping.");
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted.");
    }
  }

  public static void main(String[] args) {
    // Creating thread objects
    Thread_Methods t1 = new Thread_Methods();
    t1.setName("Thread-1");

    // getName() - Returns the name of the thread
    System.out.println("Thread Name: " + t1.getName());

    // getPriority() - Returns the priority of the thread (default is 5)
    System.out.println("Thread Priority: " + t1.getPriority());

    // getState() - Returns the current state (NEW before start)
    System.out.println("State before start: " + t1.getState());

    // isAlive() - Checks if the thread has been started and not yet died
    System.out.println("Is alive before start? " + t1.isAlive());

    // start() - Begins the execution and JVM calls the run() method
    t1.start();
    System.out.println("State after start: " + t1.getState());
    System.out.println("Is alive after start? " + t1.isAlive());

    try {
      // join() - Stops the main thread until t1 finishes its execution
      System.out.println("Main thread waiting for " + t1.getName() + " to join...");
      t1.join(); 
    } catch (InterruptedException e) {
      System.out.println(e);
    }

    // isAlive() - Checks state after termination
    System.out.println("Is alive after termination? " + t1.isAlive());
    System.out.println("Final State: " + t1.getState());
    System.out.println("Main thread execution complete.");
  }
}
