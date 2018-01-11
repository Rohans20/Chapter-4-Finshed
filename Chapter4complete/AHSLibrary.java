
/**
 * Write a description of class AHSLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AHSLibrary
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        Library ahs = new Library(10, "Acalanes");
        
        Author a = new Author("Jim", 23);
        Book b = new Book(a,"Java Book");
        ahs.addBook(b);
        Author t = new Author("Tim", 25);
        Book c = new Book(t, "Python Book");
        ahs.addBook(c);
        System.out.println(ahs);
    }
}
