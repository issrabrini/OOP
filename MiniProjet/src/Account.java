import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public  class Account {

    protected Map<String, String> Credentials; // Storing username, password, email, and address in memory.
    protected Library library;
    protected Event event;
    CollectionOfEvents collectionOfEvents;


    public Account(Library library,CollectionOfEvents collectionOfEvents) {
        Credentials = new HashMap<>();
        this.library = library;
        this.collectionOfEvents =  collectionOfEvents;
    }
    public void register()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (!Credentials.containsKey(username))
        {
            Credentials.put(username, password);
            System.out.println(" registered successfully.");
        } else
        {
            System.out.println("Username already exists. Please choose a different username.");
        }
    }
    public boolean authenticateUser(String username, String password)
    {
        if (Credentials.containsKey(username)) {
            return password.equals(Credentials.get(username));
        }
        return false;
    }
}




