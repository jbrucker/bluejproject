import java.util.concurrent.*;
/**
 * Ask the user his name, but don't wait forever.
 * 
 * @author Jim Brucker 
 */
public class ImpatientGreeter
{
    
    /**
     * Constructor for objects of class ImpatientGreeter
     */
    public ImpatientGreeter()
    {

    }

    public static void runInThread(Prompter prompter) {
        Thread thread1 = new Thread(prompter, "Prompter");
        thread1.start();
        try {
            thread1.join(5000); // wait at most 5 seconds
            if (thread1.isAlive()) thread1.interrupt();
        } catch(InterruptedException ie) {
            System.out.println("Interrupted while waiting.");
            // ignore it and go back to work
        } finally {
           
        }

    }
    
    
    public static void runInExecutor(Prompter prompter) {
        ExecutorService executor = Executors.newSingleThreadExecutor( );
        executor.execute( prompter );
        
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch(InterruptedException ie) {
            System.out.println("Interrupted while waiting.");
            // ignore it and go back to work
        } finally {
           if (!executor.isTerminated()) executor.shutdownNow( );
        }
    }
    
    
    public static void main(String [] args) {
        Prompter prompter = new Prompter();
        
        runInExecutor( prompter );
        
        String name = prompter.getName();
        if (name != null) System.out.println("Hello, "+name);
        else System.out.println("\nHello, SLOW POKE. Learn to type faster!");
        
        System.exit(0);
    }
    
    static class Prompter implements Runnable {
        private String name = null;
        
        public void run() {
            java.util.Scanner console = new java.util.Scanner(System.in);
            do {
                System.out.print("What is your name? ");
                name = console.nextLine().trim();
            } while(name==null || name.isEmpty());
        }
        
        public String getName() { return name; }
        
        public void finalize() {
            System.out.println(Thread.currentThread().getName()+" finalized.");
        }
    }
    
}
