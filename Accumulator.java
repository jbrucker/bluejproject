 
/**
 * Add values to a total
 * 
 * @author Jim Brucker 
 * @version 1.0
 */
public class Accumulator
{
    private long total = 0;
    /**
     * Constructor for objects of class Accumulator
     */
    public Accumulator() { }

    /** Add an amount to the accumulator value. */
    public synchronized void add(int amount) { total = total + amount; }
    
    /** Get the value of accumulator. */
    public long get() { return total; }
}
