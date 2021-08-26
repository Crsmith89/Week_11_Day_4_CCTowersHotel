import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return capacity;
    }


    public boolean addGuest(Guest guest) {
        if (guests.size() < capacity) {
            this.guests.add(guest);
            return true;
        } else {
            return false;
        }
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
        }
}
