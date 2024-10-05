import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private Map<String, Room> rooms;

    public Hotel() {
        rooms = new HashMap<>();
    }

    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    }

    public Room getRoom(String roomNumber) {
        return rooms.get(roomNumber);
    }

    public void bookRoom(String roomNumber, Service service) {
        Room room = rooms.get(roomNumber);
        if (room != null) {
            room.addService(service.getName(), service.getCost());
            System.out.println("Added " + service.getName() + " service to " + room.getDescription() + " - Room " + roomNumber);
        } else {
            System.out.println("Room " + roomNumber + " not found.");
        }
    }

    public void displayBookingDetails(String roomNumber) {
        Room room = rooms.get(roomNumber);
        if (room != null) {
            room.displayBookingDetails();
        } else {
            System.out.println("Room " + roomNumber + " not found.");
        }
    }
}