
/**
 * Write a description of class HelloTask here.
 * 
 * @author Jim Brucker 
 * @version 1.0
 */
public class HelloTask implements Runnable
{
    /**
     * Constructor for objects of class HelloTask
     */
    public HelloTask()
    {

    }

    public void run() {
        String name = Thread.currentThread().getName();
        boolean alive = Thread.currentThread().isAlive();
        System.out.printf("this is %s and I'm %s\n", name, (alive?"alive":"dead"));
    }
}
