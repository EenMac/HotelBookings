import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Guest> guests;
    private RoomType capacity;

    public Room(RoomType capacity) {
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

    public RoomType getCapacity() {
        return this.capacity;
    }
}
