
/**
 * Problems using generics.
 */
public class Generics
{
    public static <E extends Comparable<E>> E max(E a, E b) {
        if (a.compareTo(b) > 0) return a;
        return b;        
    }
    
    public static void main(String[] args) {
        String x = max("Cat", "Dog");
    }
        
}
