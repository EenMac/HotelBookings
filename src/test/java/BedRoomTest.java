import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {


    private BedRoom bedRoom;
    private BedRoom doubleBedroom;
    private Guest guest;
    @Before
    public void Room(){
        bedRoom = new BedRoom(RoomType.Single, 6);
        doubleBedroom = new BedRoom(RoomType.Double, 7);
        guest = new Guest("Jeff");
    }

    @Test
    public void getRoom() {
        assertEquals(RoomType.Single, bedRoom.getRoom());
    }

    @Test
    public void getRoomCapacity() {
        assertEquals(1, bedRoom.getValueOfEnum());
    }

    @Test
    public void getDoubleRoom() {
        assertEquals(RoomType.Double, doubleBedroom.getRoom());
    }

    @Test
    public void getDoubleRoomCapacity() {
        assertEquals(2, doubleBedroom.getValueOfEnum());
    }

    @Test
    public void canAddGuestToRoom() {
        bedRoom.checkGuestIn(guest);
        assertEquals(1, bedRoom.getNumberOfBookings());
    }

}
