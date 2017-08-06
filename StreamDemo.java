import java.util.*;
import java.util.function.*;

public class StreamDemo
{
    public static List<String> fruit = Arrays.asList("durian","orange","apple","banana",
                        "guava","orange", "rambutan", "apple");   
       
    public static List<String> getFruit() { return Collections.unmodifiableList(fruit); }
    
    public static void main(String [] args) {
        // write as anonymous class
       //Consumer<String> print1 = new Consumer<String> {
      //    public void accept(String arg) { System.out.println(arg); }
       //};
       // write as a Lambda
       //Consumer<String> print2 = (String arg) -> { System.out.println(arg); };
       
       // write as a Lambda w/o unnecessary code
       //Consumer<String> print3 = (arg) -> System.out.println(arg);
       
      // write a Lambda using a Function Reference
       //Consumer<String> print4 = System.out::println;
            
       //fruit.forEach( (arg) -> System.out.println(arg) );
       
      
       fruit.stream()
            .filter( (x)->  ! x.equals("durian") )   // I hate this fruit, so get rid of it
            .map( s -> s.toUpperCase() )
            .sorted( (a,b) -> a.length()-b.length() ) // sort by length of name (Comparator)
            .forEach(System.out::println);
    }
}
    
    
