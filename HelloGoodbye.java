
/**
 * Use threads to print hello and goodbye asynchronously.
 */
public class HelloGoodbye
{
    private String name;
    public String getName() { return name; }

    public static void main(String [] args) {
        HelloGoodbye obj = new HelloGoodbye( );    
        Thread thread1 = new Thread( new GreetingTask("Hello"), "Hello Thread" );
        Thread thread2 = new Thread( new GreetingTask("and") , "And Thread" );
        Thread thread3 = new Thread( new GreetingTask("Goodbye"), "Bye Thread" );
        System.out.println(">>> starting threads");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(">>> threads started");
        try {
            System.out.println(">>> wait for threads to finish");
            long max_timeout = 3000; // millisec
            thread1.join(max_timeout);
            thread1.interrupt();
            thread2.join(max_timeout);
            thread2.interrupt();
            thread3.join(max_timeout);
            thread3.interrupt();
        } catch( InterruptedException ie) {
            System.out.println("Interrupted");
        }
        System.out.println(">>> main done");
    }
    
    static class GreetingTask implements Runnable {
        private String greeting;
        public GreetingTask(String greet) { this.greeting = greet; }
        public void run() {
            while(true) {
                System.out.printf("%tT %s\n", System.currentTimeMillis(), greeting);
                try {
                    Thread.sleep(504); // time in millisec
                } catch (InterruptedException ie) {
                    String name = Thread.currentThread().getName();
                    System.out.println( name + " interrupted!");
                    return;
                }
            }
        }
    }
}


