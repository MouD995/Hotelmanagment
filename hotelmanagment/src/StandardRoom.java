public class StandardRoom extends Room {
    public StandardRoom(String roomNumber, double baseRate) {
        super(roomNumber, "Standard Room", baseRate);
    }

    @Override
    public String getDescription() {
        return "Standard Room";
    }
}