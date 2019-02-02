
/**
 * An animal that can walk() and fly()
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kangaroo extends Animal implements Walking, Flying
{
    
   

    /**
     * Constructor for objects of class Kangaroo
     */
    public Kangaroo()
    {
        super("Kangaroo","A marsupial with buffed up muscles");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String makeNoise()
    {
        return "Bow-wow.  I am a very confused kangaroo";
    }
    
    
    public String eat()
    {
        return "I pretend to be vegan, but I really enjoy meat";
    }
    
    
   public String walk()
   {
       return "I prefer uber, if you please.";
    }


    public String fly()
    {
        return "Qantas business class is the way to go!";
    }   
}
