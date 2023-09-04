package ExceptionHandling;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class HotelReservationSystem {
    private List<Guest> guests = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    public void addGuest(String name, String phoneNumber) {
        guests.add(new Guest(name, phoneNumber));
    }

    public void displayGuests() {
        System.out.println("Guests details:");
        for (Guest guest : guests) {
            System.out.println("Name: " + guest.getName() + ", Phone Number: " + guest.getPhoneNumber());
        }
    }

    public void makeReservation(String guestName, String reservationType) throws InvalidReservationException, RoomNotFoundException {
        Guest guest = null;
        for (Guest g : guests) {
            if (g.getName().equals(guestName)) {
                guest = g;
                break;
            }
        }

        if (guest == null) {
            throw new InvalidReservationException("Guest not found: " + guestName);
        }

        Room availableRoom = null;
        for (Room room : rooms) {
            if (room.isAvailable() && room.getRoomType().equals(reservationType)) {
                availableRoom = room;
                break;
            }
        }

        if (availableRoom == null) {
            throw new RoomNotFoundException("No available room of type " + reservationType);
        }

        reservations.add(new Reservation(guest, reservationType));
        availableRoom.bookRoom();
    }

    public void displayRoomAvailability() {
        System.out.println("Room Availability:");
        for (Room room : rooms) {
            System.out.println("Room Number: " + room.getRoomNumber() +
                    ", Room Type: " + room.getRoomType() +
                    ", Available: " + room.isAvailable());
        }
    }

    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.rooms.add(new Room(101, "Standard"));
        hotelReservationSystem.rooms.add(new Room(102, "Standard"));
        hotelReservationSystem.rooms.add(new Room(103, "Deluxe"));
        hotelReservationSystem.rooms.add(new Room(104, "Deluxe"));

        hotelReservationSystem.addGuest("selva", "9876546456");
        hotelReservationSystem.addGuest("vjselva", "9876543210");

        try {
            hotelReservationSystem.makeReservation("selva", "Standard");
            hotelReservationSystem.makeReservation("vjselva", "Normal"); 
        } catch (InvalidReservationException | RoomNotFoundException e) {
            System.out.println("Something wrong!!!"+e.getMessage());
        }

        hotelReservationSystem.displayGuests();
        hotelReservationSystem.displayRoomAvailability();
    }
}
class InvalidReservationException extends Exception {
    public InvalidReservationException(String message) {
        super(message);
    }
}

class RoomNotFoundException extends Exception {
    public RoomNotFoundException(String message) {
        super(message);
    }
}

