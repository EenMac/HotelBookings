public class ConferenceRoom extends Room{
    private String name;

    public ConferenceRoom(RoomType capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNightlyRate(){
        return getValueOfEnum() * 100;
    }

}
