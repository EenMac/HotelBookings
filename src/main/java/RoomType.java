public enum RoomType {

    Single(1),
    Double(2);

    private final Integer capacity;

    RoomType(Integer capacity) {
        this.capacity = capacity;
    }
}
