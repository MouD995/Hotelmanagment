public class DeluxeRoom extends Room {
    public DeluxeRoom(String roomNumber, double baseRate) {
        super(roomNumber, "Deluxe Room", baseRate);
    }

    @Override
    public String getDescription() {
        return "Deluxe Room";
    }
}