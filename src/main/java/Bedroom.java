import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private int nightlyRate;

    public Bedroom( int capacity, int roomNumber, RoomType roomType, int nightlyRate){
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public RoomType getRoomType(){
        return roomType;
    }

    public int getRoomTypeValue(){
        return roomType.getValue();
    }

    public int getNightlyRate(){
        return this.nightlyRate;
    }
}
