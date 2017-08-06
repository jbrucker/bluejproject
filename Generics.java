
/**
 * Problems using generics.
 * This example defines a static max method with a type parameter.
 * Type parameters on static methods are totally unrelated to
 * type parameter on the class (there is no type param on this class).
 */
public class Generics
{
    /** A generic "max" method for comparing two Comparable objects. */
    public static <E extends Comparable<E>> E max(E a, E b) {
        if (a.compareTo(b) > 0) return a;
        return b;        
    }
    
    public static void main(String[] args) {
        String x = max("Cat", "Dog");
    }
        
}
