import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel testHotel;
    Bedroom testBedroom;
    Guest testGuy;

    @Before
    public void before() {
        testHotel = new Hotel("CC Towers");
        testBedroom = new Bedroom(4, 16, RoomType.FAMILY);
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
        testHotel.addBedroom(testBedroom);
        assertEquals(true, testHotel.checkGuestIntoBedroom(testGuy, testBedroom));
    }
}
