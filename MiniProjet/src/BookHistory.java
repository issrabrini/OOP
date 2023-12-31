import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class BookHistory {
    ArrayList<Book> booksBorrowed;

    public BookHistory() {
        this.booksBorrowed = new ArrayList<Book>();
    }
    public void addBook(Book book)
    {
        this.booksBorrowed.add(book);
    }
    public void displayBooks()
    {
        for(Book book:booksBorrowed)
        {
            book.displayInformation();
        }
    }
}
