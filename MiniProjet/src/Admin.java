import java.util.Scanner;

import static java.lang.System.exit;

class Admin extends Account {
    private String name;
    private String email;


    public Admin( Library library, CollectionOfEvents collectionOfEvents) {
        super(library, collectionOfEvents);
    }

    public void addBook(Book book) {
        this.library.addBook(book);
    }

    public void removeBook(String title) {
        this.library.removeBook(title);
    }

    public void displayBooks() {
        this.library.displayBooks();
    }
    public void createEvent()
    {
        System.out.println("Enter the name of the event");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter the date of the event");
        String date = scanner.nextLine();
        System.out.println("Enter the location of the event");
        String location = scanner.nextLine();
        System.out.println("Enter the description of the event");
        String description = scanner.nextLine();
        System.out.println("Enter entry fee of the event");
        int entryFee = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the number of tickets");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();
        Event event = new Event(name, date, location, description, entryFee, numberOfTickets);
        collectionOfEvents.addEvent(event);
    }

    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1-Add Book");
            System.out.println("2-Remove Book");
            System.out.println("3-Display Books");
            System.out.println("4-Create Event");
            System.out.println("5-Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the title of the book");
                    String title = scanner.nextLine();
                    System.out.println("Enter the author of the book");
                    String author = scanner.nextLine();
                    System.out.println("Enter the publication year of the book");
                    int publicationYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter book id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Book book = new Book(title, author, publicationYear, id);
                    this.addBook(book);
                    break;
                case 2:
                    System.out.println("Enter the title of the book");
                    String title1 = scanner.nextLine();
                    this.removeBook(title1);
                    break;
                case 3:
                    this.displayBooks();
                    break;
                case 4:
                    this.createEvent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
