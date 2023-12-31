import java.time.LocalDate;
import java.util.ArrayList;

class Library {
    ArrayList<Book> books;


    public Library() {
        books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", published in " + book.getPublicationYear());
        }
    }

    public void removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                break;
            }
        }
    }


    public Book getBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}