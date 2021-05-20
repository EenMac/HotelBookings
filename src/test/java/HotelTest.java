import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private BedRoom bedroom1;
    private BedRoom bedroom2;
    private BedRoom bedroom3;
    private ConferenceRoom confRoom1;
    private ConferenceRoom confRoom2;
    private ConferenceRoom confRoom3;
    private Guest guest;
    private Hotel hotel;
    private ArrayList<BedRoom> rooms;
    private ArrayList<ConferenceRoom> confRooms;
    @Before
    public void before(){
        bedroom1 = new BedRoom(RoomType.Single, 8);
        bedroom2 = new BedRoom(RoomType.Single, 6);
        bedroom3 = new BedRoom(RoomType.Double, 7);
        rooms = new ArrayList<>();
        confRooms = new ArrayList<>();
        rooms.add(bedroom1);
        rooms.add(bedroom2);
        rooms.add(bedroom3);
        guest = new Guest("Bob");
        hotel = new Hotel(rooms,confRooms);
   }

    @Test
    public void hasThreeBedrooms() {
        assertEquals(3, hotel.getNumberBedrooms());
    }

    @Test
    public void hasZeroConferenceRooms() {
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canBookGuestIn() {
        hotel.checkGuestsIn(guest);
        assertEquals(1, bedroom1.getNumberOfBookings());
    }

    @Test
    public void canCheckGuestsOut() {
        hotel.checkGuestsIn(guest);
        hotel.checkGuestsOut(bedroom1,guest);
        assertEquals(0, bedroom1.getNumberOfBookings());
    }
}
