public enum RoomType {

    Single(1),
    Double(2),
    Conference(30);

    private final Integer capacity;

    RoomType(Integer capacity) {
        this.capacity = capacity;
    }

    public int getCapacityValue() {
        return this.capacity;
    }
}
