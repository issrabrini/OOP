import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library()
    {
        this.books=new ArrayList<Book>();
    }
    public void addBook(Book book)
    {
        this.books.add(book);
    }
    public void removeBook(Book book)
    {
        this.books.remove(book);
    }
    public void displayBooks()
    {
        for(Book book:books)
        {
            book.displayInformation();
        }
    }
    public Boolean isBookAvailable(Book book)
    {
        return books.contains(book);
    }
}
