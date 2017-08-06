import java.time.*;
/**
 * An interface with Java 8 new features.
 * In Java 8 interfaces can have:
 * a) method code in "default" methods
 * b) static methods with code
 */
public interface MyInterface
{
    default String greeting() { return "Hello, Nerd"; }
    
    public void isNerd();
    
    public static LocalTime timeOfDay() {
        return LocalTime.now();
    }
    
    static MyInterface create() {
        return null;
    }
}
