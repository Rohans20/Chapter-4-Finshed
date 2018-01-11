
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 // instance variables - replace the example below with your own
    public class Book
{
    private Author author;
    private String title;
    public Book(Author auth, String tit) {
        this.author = auth;
        this.title = tit;
    }
    
    public String toString() {
        return "The author is " + author + "and book is " + title;
    }
    
}// instance variables - replace the example below with your own
    
