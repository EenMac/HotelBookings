public class Bookings{

    private Room bedRoom;
    private Integer numberNights;

    public Bookings(Room bedRoom, Integer numberNights) {
        this.bedRoom = bedRoom;
        this.numberNights = numberNights;
    }


    public int getNumberOfNights() {
        return this.numberNights;
    }

    public Room getRoom() {
        return this.bedRoom;
    }
    public int getTotalBill(){
        return this.numberNights * this.bedRoom.getNightlyRate();
    }
}
