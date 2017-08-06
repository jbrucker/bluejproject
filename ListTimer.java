import java.util.*;   // for List, LinkedList, ArrayList, Random
/**
 * Display run-time for some repeated list operations.
 * @author Jim Brucker
 */
public class ListTimer
{
    private static StopWatch timer = new StopWatch();
    
    /** Insert numbers into a list at random locations. Return elapsed time in nanosec. */
    public static long randomInsert(List<Integer> list, int count) {
        Random rand = new Random( ); // make it repeatable.
        // to avoid repeatedly asking for the list size, save it
        int size = list.size();
        timer.reset();
        timer.start();
        while(count-- > 0) {
            int k = rand.nextInt(size+1);   // random int is always LESS than the parameter value
            list.add(k, new Integer(count));
            size++;
        }
        timer.stop();
        return timer.elapsed();
    }
    
    public static void main(String [] args) {
        final int count = 100_000;
        List<Integer> list = new ArrayList<>();
        System.out.printf("Randomly insert %d values into %s\n", count, list.getClass().getSimpleName() );
        long elapsed = randomInsert(list, count);
        System.out.printf("Elapsed:  %.3f usec\n", 1.0E-3*elapsed);
        
        list = new LinkedList<>();
        System.out.printf("Randomly insert %d values into %s\n", count, list.getClass().getSimpleName() );
        elapsed = randomInsert(list, count);
        System.out.printf("Elapsed:  %.3f usec\n", 1.0E-3*elapsed);
    }

}


class StopWatch {
    long startTime;
    long stopTime;
    long elapsed;
    boolean running;
    
    /** Start or restart the timer */
    public void start() {
        startTime = System.nanoTime();
        running = true;
    }
    
    public void stop() {
        if (running) {
            stopTime = System.nanoTime();
            running = false;
        }
    }
    
    public long elapsed() {
        if (running) return System.nanoTime() - startTime;
        return stopTime - startTime;
    }
    
    public void reset() {
        running = false;
        stopTime = startTime = System.nanoTime();
    }
}
