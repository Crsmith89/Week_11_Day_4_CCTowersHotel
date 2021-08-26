import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public int getNumberOfRooms(){
        return this.bedrooms.size();
    }

    public boolean checkGuestIntoBedroom(Guest guest, Bedroom bedroom){
        return bedroom.addGuest(guest);
    }
}
