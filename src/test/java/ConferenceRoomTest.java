import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom confRoom;
    @Before
    public void before(){
        confRoom = new ConferenceRoom(RoomType.Conference, "Ball Room");
    }

    @Test
    public void hasName() {
        assertEquals("Ball Room", confRoom.getName());
    }

    @Test
    public void hasRoom() {
        assertEquals(RoomType.Conference, confRoom.getRoom());
    }

    @Test
    public void hasCapacity() {
        assertEquals(30, confRoom.getValueOfEnum());
    }
}
