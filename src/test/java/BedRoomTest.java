import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {


    private BedRoom bedRoom;


    @Before
    public void Room(){
        bedRoom = new BedRoom(RoomType.Single, 6);
    }

    @Test
    public void getRoomCapacity() {
        assertEquals(RoomType.Single, bedRoom.getCapacity());
    }
}
