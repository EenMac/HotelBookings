public class BedRoom extends Room{

    private RoomType roomType;
    private Integer roomNumber;

    public BedRoom(RoomType capacity, Integer roomNumber) {
        super(capacity);
        this.roomNumber = roomNumber;
    }
}
