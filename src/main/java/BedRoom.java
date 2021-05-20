public class BedRoom extends Room{

    private RoomType roomType;
    private int roomNumber;

    public BedRoom(RoomType capacity,int roomNumber) {
        super(capacity);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNightlyRate() {
        return getValueOfEnum() * 50;
    }
}
