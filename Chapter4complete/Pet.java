
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean alive;
    public static int numPets;
    
    public Pet(String nm, boolean al)
    {
        this.name = nm;
        this.alive = al;
        numPets++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public static void example() {
        System.out.println("This is static!");
    }

    public String toString() {
        return "This pet is named: " + this.name;
    }
   
}
