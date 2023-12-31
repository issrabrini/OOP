import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    Library library = new Library();
    CollectionOfEvents collectionOfEvents = new CollectionOfEvents();
    Book TheLordOfTheRings = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954,5);
    Book HarryPotter = new Book("Harry Potter", "J. K. Rowling", 1997,10);
    Book TheHobbit = new Book("The Hobbit", "J. R. R. Tolkien", 1937,12);
    Book TheDaVinciCode = new Book("The Da Vinci Code", "Dan Brown",2003,444);
    Book TheAlchemist = new Book("The Alchemist", "Paulo Coelho",1988,134);
    Book TheLittlePrince = new Book("The Little Prince", "Antoine de Saint-Exupéry",1943,12345);
    Book TheCatcherintheRye = new Book("The Catcher in the Rye", "J. D. Salinger", 1951,8376);
    public void menu()
    {
        library.addBook(TheLordOfTheRings);
        library.addBook(HarryPotter);
        library.addBook(TheHobbit);
        library.addBook(TheDaVinciCode);
        library.addBook(TheAlchemist);
        library.addBook(TheLittlePrince);
        library.addBook(TheCatcherintheRye);
        while (true){
            System.out.println("Welcome to the library!");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    adminMenu();
                    break;
                case 2:
                    userMenu();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }


    }

   public void adminMenu()
       {while (true) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("1. Register ");
           System.out.println("2. Exit");
           int choix1 = scanner.nextInt();
           scanner.nextLine();
           Admin admin= new Admin(library,collectionOfEvents);
           switch (choix1) {
               case 1:
                   admin.register();
                   admin.Menu();
                   break;
               case 2:
                   return;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       }
   }
   public void userMenu()
   {
       while (true) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("1. Register ");
           System.out.println("2. Exit");
           int choix = scanner.nextInt();
           scanner.nextLine();
           User user = new User(library,collectionOfEvents);
           switch (choix) {
               case 1:
                   user.register();
                   user.Menu();
                   break;
               case 2:
                   return;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       }
   }

}
