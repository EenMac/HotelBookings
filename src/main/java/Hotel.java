import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;

    public Hotel(ArrayList<BedRoom> bedrooms, ArrayList<ConferenceRoom> confRooms) {
        this.bedrooms = bedrooms;
        this.confRooms = confRooms;
    }

    public ArrayList<BedRoom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConfRooms() {
        return confRooms;
    }

    public void setBedrooms(ArrayList<BedRoom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setConfRooms(ArrayList<ConferenceRoom> confRooms) {
        this.confRooms = confRooms;
    }

    public void checkGuestsIn(Guest guest){
        for(BedRoom bedroom: this.bedrooms){
            if(bedroom.getNumberOfBookings() == 0){
                bedroom.checkGuestIn(guest);
                break;
            }
        }
    }

    public void checkGuestsOut(BedRoom CheckoutBedroom,Guest guest){

        for(BedRoom bedroom: this.bedrooms){
            if (bedroom.getRoomNumber() == CheckoutBedroom.getRoomNumber()){
                bedroom.guestsCheckOut(guest);
            }
        }

    }
    public int getNumberBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.confRooms.size();
    }
}
