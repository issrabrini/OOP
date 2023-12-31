import java.util.ArrayList;

public class Event {
    private String name;
    private String date;
    private String place;
    private String description;
    private int id;
    private static int idCounter=0;
    private int entryFee;
    private int numberOfticketsAvailable;
    private ArrayList<User> participants = new ArrayList<User>();
    public Event(String name, String date, String place, String description, int entryFee, int numberOfticketsAvailable) {
        this.id = idCounter++;
        this.name = name;
        this.date = date;
        this.place = place;
        this.description = description;
        this.entryFee = entryFee;
        this.numberOfticketsAvailable = numberOfticketsAvailable;
    }
    public void setnumberOfticketsAvailable(int numberOfticketsAvailable)
    {
         this.numberOfticketsAvailable=numberOfticketsAvailable;
    }
    public int getnumberOfticketsAvailable()
    {
        return this.numberOfticketsAvailable;
    }
    public void displayInformation()
    {
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Date: "+this.date);
        System.out.println("Place: "+this.place);
        System.out.println("Description: "+this.description);
    }
    public void addParticipant(User user)
    {
        this.participants.add(user);
    }

    public int getId() {
        return id;
    }

    public boolean isFull() {
        return participants.size()>=numberOfticketsAvailable;
    }
}
