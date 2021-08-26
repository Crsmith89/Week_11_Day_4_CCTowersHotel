import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return capacity;
    }


    public void addGuest(Guest guest) {
        if (capacity < guests.size()) {
            this.guests.add(guest);
        }
    }
    public void removeGuest(Guest guest){
        this.guests.remove(guest);

        }


}
