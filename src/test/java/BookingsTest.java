import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BookingsTest {

    private Bookings bookings;
    private Bookings bookings2;
    private Bookings bookings3;
    private BedRoom bedRoom;
    private BedRoom bedRoom2;
    private ConferenceRoom confRoom;
    private Integer numOfNights;

    @Before
    public void Bookings(){
        bedRoom = new BedRoom(RoomType.Double, 7);
        bedRoom2 = new BedRoom(RoomType.Single, 3);
        confRoom = new ConferenceRoom(RoomType.Conference, "BallRoom");
        bookings = new Bookings(bedRoom, 2);
        bookings2 = new Bookings(bedRoom2, 3);
        bookings3 = new Bookings(confRoom, 1);
    }

    @Test
    public void bookingHasNumberOfNights() {
        assertEquals(2, bookings.getNumberOfNights());
    }

    @Test
    public void hasRoom() {
        assertEquals(bedRoom, bookings.getRoom());
    }

    @Test
    public void returnConfNightlyRate() {
        assertEquals(3000, confRoom.getNightlyRate());
    }
    @Test
    public void returnDoubleNightlyRate(){
        assertEquals(100, bedRoom.getNightlyRate());
    }

    @Test
    public void returnSingleNightlyRate() {
        assertEquals(50, bedRoom2.getNightlyRate());
    }

    @Test
    public void singleTotalBill() {
        assertEquals(150, bookings2.getTotalBill());
    }

    @Test
    public void doubleTotalBill() {
        assertEquals(200, bookings.getTotalBill());
    }
    @Test
    public void conferenceTotalBill(){
        assertEquals(3000, bookings3.getTotalBill());
    }
}
