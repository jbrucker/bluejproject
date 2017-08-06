
/**
 * A person with a name.
 */
public class Person
{
    /* instance variables - replace the example below with your own*/
    private String name;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name)
    {
        if (name == null) {
            throw  new  IllegalArgumentException("Name may not be null.");
        }
        this.name = name;
    }

    /**
     * 
     */
    public String toString()
    {
        return name;
    }

    /**
     * 
     */
    public boolean equals(Object obj)
    {
        if ( ! (obj instanceof Person)) {
            return false;
        }
        Person other = (Person)obj;
        return this.name.equals(other.name);
    }

    /**
     * 
     */
    public int hashCode()
    {
        return name.hashCode();
    }
}
