import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Guest> guests;
    private RoomType capacity;
    public Room(RoomType capacity) {
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

    public RoomType getRoom() {
        return this.capacity;
    }

    public int getValueOfEnum() {
        return this.capacity.getCapacityValue();
    }

    public void checkGuestIn(Guest guest){
        this.guests.add(guest);
    }

    public void guestsCheckOut(Guest guest){
        this.guests.remove(this.guests.indexOf(guest));
    }
    public int getNumberOfBookings(){
        return this.guests.size();
    }
    public ArrayList<Guest> getGuests(){
        return this.guests;
    }
    public abstract int getNightlyRate();

}
