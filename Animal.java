
/**
 * Abstract class Animal - Basic Animal Class  Used to show students
 * how abstract classes and interfaces work.
 * Original Creator: Garrett Shorr
 *
 * @author (John Kim)
 * @version (2019-02-01)
 */
public abstract class Animal
{
    // instance variables - replace the example below with your own
    private String name;
    private String desc;
    
    Animal (String name, String desc)
    {
      this.name = name;
      this.desc = desc;
    }

    /**
     *
     * @return    The sound of the animal eating
     */
    public abstract String eat();
    
    /**
     *
     * @return    The sound of the animal making some noise
     */
    public abstract String makeNoise();
}
