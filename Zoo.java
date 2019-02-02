import java.util.*;

/**
 * A zeoo where many animals live
 *
 * @author (John Kim)
 * @version (2019-02-01)
 * Inspired by Garrett Shorr's work
 */

public class Zoo
{
    // instance variables - replace the example below with your own
    
    ArrayList<Animal> animals;
    
    /**
     * Constructor for objects of class Zoo
     */
    public Zoo()
    {
        // initialise instance variables
        animals = new ArrayList<>();
    }

    /**
     * visit the zoo with animals
     *

     */
    public void visit()
    {
        for (Animal e : animals)
        {
            System.out.println(e.eat());
        }
    }
    
    /**
     * Fill the zoo with animals
     *
     */
    public void populate()
    {
        animals.add(new Kangaroo());
    }
}
