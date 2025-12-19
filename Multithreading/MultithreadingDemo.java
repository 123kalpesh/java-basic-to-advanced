//Multithreading : - thread Safety :- Protecting shared resources 
//Deadlocks: When threads wait indefinitely
//Thread Pools: Efficient thread management
// Theory :- a feature that allows a program to execute multiple parts,
//             or threads, concurrently to maximize CPU utilization 
//             and improve application performance and responsiveness
// Basic Multithreading Example
class MyThread extends Thread {
    private String threadName;
    
    public MyThread(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(threadName + " is running: " + i);
                // Let the thread sleep for a while
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        System.out.println(threadName + " exiting.");
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");
        
        // Create two threads
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        // Start the threads
        thread1.start();
        thread2.start();
        
        // Main thread continues its execution
        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        
        System.out.println("Main thread exiting.");
    }
}