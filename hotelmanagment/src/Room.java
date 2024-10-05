import java.util.ArrayList;
import java.util.List;

public abstract class Room {
    protected String roomNumber;
    protected String roomType;
    protected double baseRate;
    protected List<String> services;
    protected double totalCost;

    public Room(String roomNumber, String roomType, double baseRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.baseRate = baseRate;
        this.services = new ArrayList<>();
        this.totalCost = baseRate;
    }

    public void addService(String service, double serviceCost) {
        services.add(service);
        totalCost += serviceCost;
    }

    public abstract String getDescription();

    public String getRoomNumber() {
        return roomNumber;
    }

    public void displayBookingDetails() {
        System.out.println("Booking for " + roomType + " - Room " + roomNumber);
        System.out.println("Services added: " + services);
        System.out.println("Total Cost: $" + totalCost);
    }
}