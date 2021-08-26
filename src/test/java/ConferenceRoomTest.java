import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    public ConferenceRoom testConferenceRoom;

    @Before
    public void before(){
        testConferenceRoom = new ConferenceRoom(200, "The Biggest Room");
    }

    @Test
    public void checkConferenceRoomCapacity(){
        assertEquals(200, testConferenceRoom.getCapacity());
    }

    @Test
    public void checkConferenceRoomHasName(){
        assertEquals("The Biggest Room", testConferenceRoom.getName());
    }
}
