public class SuiteRoom extends Room {
    public SuiteRoom(String roomNumber, double baseRate) {
        super(roomNumber, "Suite Room", baseRate);
    }

    @Override
    public String getDescription() {
        return "Suite Room";
    }
}