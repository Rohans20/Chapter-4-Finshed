
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private Book[] books;
    private String name;
    private int index = 0;
    
    public Library(int size, String nm) {
        this.books = new Book[size];
        this.name = nm;
    }
    
    public String toString() {
        String output = "The library has: \n";
        for(Book b : books) {
            output += b + "\n";
        }
        return output;
    }
    
    public void addBook(Book b) {
        books[index] = b;
        index++;
    }
}
