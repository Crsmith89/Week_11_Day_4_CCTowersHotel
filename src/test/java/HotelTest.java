import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel testHotel;
    Bedroom testBedroom;
    ConferenceRoom testConferenceRoom;
    Guest testGuy;

    @Before
    public void before() {
        testHotel = new Hotel("CC Towers");
        testBedroom = new Bedroom(4, 16, RoomType.FAMILY);
        testConferenceRoom = new ConferenceRoom(5, "Conference Room");
        testGuy = new Guest("Fekky");
    }

    @Test
    public void hotelHasAName(){
        assertEquals("CC Towers", testHotel.getName());
    }

    @Test
    public void addRoomsToHotelBedroomList() {
        testHotel.addBedroom(testBedroom);
        assertEquals(1, testHotel.getNumberOfRooms());
    }

    @Test
    public void hotelCanCheckGuestIntoBedroomTrue() {
        testHotel.addBedroom(testBedroom);
        assertEquals(true, testHotel.checkGuestIntoBedroom(testGuy, testBedroom));
    }

    @Test
    public void hotelCannotCheckInGuestWhenRoomIsFull(){
        testHotel.addBedroom(testBedroom);
        testHotel.checkGuestIntoBedroom(testGuy, testBedroom);
        testHotel.checkGuestIntoBedroom(testGuy, testBedroom);
        testHotel.checkGuestIntoBedroom(testGuy, testBedroom);
        testHotel.checkGuestIntoBedroom(testGuy, testBedroom);
        assertEquals(false, testHotel.checkGuestIntoBedroom(testGuy, testBedroom));
    }

    @Test
    public void hotelCanCheckGuestIntoConferenceRoomTrue() {
        testHotel.addConferenceRoom(testConferenceRoom);
        assertEquals(true, testHotel.checkGuestIntoConferenceRoom(testGuy, testConferenceRoom));
    }

    @Test //check that the hotel cannot add to conference room when its full
    public void hotelCannotCheckIntoConferenceRoomWhenItIsFull(){
        testHotel.addConferenceRoom(testConferenceRoom);
        testHotel.checkGuestIntoConferenceRoom(testGuy, testConferenceRoom);
        testHotel.checkGuestIntoConferenceRoom(testGuy, testConferenceRoom);
        testHotel.checkGuestIntoConferenceRoom(testGuy, testConferenceRoom);
        testHotel.checkGuestIntoConferenceRoom(testGuy, testConferenceRoom);
        testHotel.checkGuestIntoConferenceRoom(testGuy, testConferenceRoom);
        assertEquals(false, testHotel.checkGuestIntoConferenceRoom(testGuy, testConferenceRoom));
    }
}
