import java.time.*;
/**
 * An interface with Java 8 new features.
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
