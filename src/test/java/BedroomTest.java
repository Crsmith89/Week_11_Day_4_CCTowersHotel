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

    @Test
    public void roomHasCorrectType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void roomTypeCheckCapacity(){
        assertEquals(bedroom.getCapacity(), bedroom.getRoomTypeValue());
    }

    @Test
    public void roomHasCorrectNumber(){
        assertEquals(3, bedroom.getRoomNumber());
    }
}
