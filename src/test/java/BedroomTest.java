import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 3, RoomType.DOUBLE);
    }

    @Test
    public void getRoomCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
}
