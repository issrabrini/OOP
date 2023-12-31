import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.exit;

class User extends Account{

    LibraryCard libraryCard;
    BookHistory bookHistory;

    public User( Library library, CollectionOfEvents collectionOfEvents) {
        super(library, collectionOfEvents);

        this.libraryCard = new LibraryCard();
        this.bookHistory = new BookHistory();
    }




    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }
    public void borrowBook(int id)
    {
        Book book = library.getBook(id);
        if (book == null) {
            System.out.println("Sorry, this book is not available.");
        } else {
            this.borrowBook(book);
        }
    }
    public void borrowBook(Book book)
    {
        if (book.isBorrowed()) {
            System.out.println("Sorry, this book is already borrowed.");
        }

        LocalDate today = LocalDate.now();
        if (!libraryCard.isActive() || today.isAfter(libraryCard.getExpirationDate())) {
            System.out.println("Sorry, your library card is not active or has expired.");
        }

        book.setBorrowed(true);
        bookHistory.addBook(book);
        System.out.println("Book borrowed successfully.");
    }
    public void returnBook(int id)
    {
        Book book = library.getBook(id);
        if (book == null) {
            System.out.println("Sorry, this book is not available.");
        } else {
            this.returnBook(book);
        }
    }
    public void returnBook(Book book)
    {
        book.setBorrowed(false);
        System.out.println("Book returned successfully.");
    }
    public void participateInEvent(Event event)
    {
        if(event.isFull())
        {
            System.out.println("Sorry, this event is full.");
        }else
        {
            event.addParticipant(this);
            event.setnumberOfticketsAvailable(event.getnumberOfticketsAvailable()-1);
            System.out.println("You have successfully participated in the event.");
        }
    }
    public void participateInEvent()
    {
        collectionOfEvents.displayEvents();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of the event");
        int id = scanner.nextInt();
        scanner.nextLine();
        int choice;
        while (true) {
            System.out.println("1-Participate");
            System.out.println("2-Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Event event = collectionOfEvents.getEvent(id);
                    if (event == null) {
                        System.out.println("Sorry, this event is not available.");
                    } else {
                        this.participateInEvent(event);
                    }
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1-Borrow Book");
            System.out.println("2-Return Book");
            System.out.println("3-Display Books");
            System.out.println("4-Borrowed Books");
            System.out.println("5-Participate in an event");
            System.out.println("6-Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the id of the book");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    this.borrowBook(id);
                    break;
                case 2:
                    System.out.println("Enter the id of the book");
                    id = scanner.nextInt();
                    this.returnBook(id);
                    break;
                case 3:
                    this.library.displayBooks();
                    break;
                case 4:
                    this.bookHistory.displayBooks();
                    break;
                case 5:
                    this.participateInEvent();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}