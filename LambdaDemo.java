/**
 * Three different ways to define an object that implements Runnable.
 */
public class LambdaDemo
{
    /** A nested class for a Runnable. */
    public static class Todo implements Runnable {
        public void run() {
            System.out.println("nested class go to lunch.");
        }
    }
    
    public static void main(String [] args) {
        // Method 1: define a class that implements Runnable. Create objects from class, as usual.
        Runnable task = new Todo();
        task.run();
        
        // Method 2: Anonymous class
        Runnable task2 = new Runnable() {
            public void run() {
                System.out.println("anonymous go to lunch");
            }
        };
        task2.run();
        
        // Method 3: Lambda expression for a Runnable
        Runnable task3 = () -> System.out.println("lambda go to lunch");
        task3.run();
    } 
    
}