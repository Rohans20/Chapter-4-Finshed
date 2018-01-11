
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    // instance variables - replace the example below with your own
    private String color;
    private String size;

    /**
     * Constructor for objects of class Hat
     */
    public Hat(String col, String sz)
    {
        // initialise instance variables
        this.color = col;
        this.size = sz;
    }

    public String getColor() {
        return this.color;
    }
    
    public String getSize() {
        return this.size;
    }
    
    public String toString() {
        return "This hat color is: " + this.color;
    }
    
   
}
