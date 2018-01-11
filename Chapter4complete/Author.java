
/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    private String name;
    private int age;
    public Author(String nm, int ag) {
        this.name = nm;
        this.age =ag;
    }
    
    public String toString() {
        return "The name of the author is " + name + "and the age is " + age;
    }
    
}// instance variables - replace the example below with your own
    