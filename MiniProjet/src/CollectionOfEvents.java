import java.util.ArrayList;

public class CollectionOfEvents {
    private ArrayList<Event> events;
    public CollectionOfEvents()
    {
        this.events=new ArrayList<Event>();
    }
    public void addEvent(Event event)
    {
        this.events.add(event);
    }
    public void displayEvents()
    {
        for(Event event:events)
        {
            event.displayInformation();
        }
    }

    public Event getEvent(int id) {
        for(Event event:events)
        {
            if(event.getId()==id)
            {
                return event;
            }
        }
        return null;
    }
}
