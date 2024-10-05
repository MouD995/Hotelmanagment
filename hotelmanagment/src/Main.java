import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        hotel.addRoom(new StandardRoom("101", 200));
        hotel.addRoom(new DeluxeRoom("102", 300));
        hotel.addRoom(new SuiteRoom("103", 500));

        System.out.println("Rooms available: 101 (Standard), 102 (Deluxe), 103 (Suite)");

        System.out.print("Enter room number to book (101, 102, 103): ");
        String roomNumber = scanner.nextLine();

        Room selectedRoom = hotel.getRoom(roomNumber);
        if (selectedRoom == null) {
            System.out.println("Room not found.");
            return;
        }

        System.out.println("Choose a service to add (1: Spa - $100, 2: Dining - $50, 3: Gym - $30): ");
        int serviceChoice = scanner.nextInt();

        Service service = null;
        switch (serviceChoice) {
            case 1:
                service = new SpaService();
                break;
            case 2:
                service = new DiningService();
                break;
            case 3:
                service = new GymService();
                break;
            default:
                System.out.println(" No service will be added.");
        }

        if (service != null) {
            hotel.bookRoom(roomNumber, service);
        }

        System.out.print("Do you want to see the booking details? yes/no: ");
        scanner.nextLine();
        String displayChoice = scanner.nextLine();

        if (displayChoice.equalsIgnoreCase("yes")) {
            hotel.displayBookingDetails(roomNumber);
        } else {
            System.out.println("Booking completed .");
        }

        scanner.close();
    }
}