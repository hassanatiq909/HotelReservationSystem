package domain;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        HotelChain chain = new HotelChain("Global Hotels");
        Hotel hotel = new Hotel("Serena");

        Room room1 = new Room(101);
        Room room2 = new Room(102);

        Guest guest = new Guest("Ali", "Lahore");

        room1.createGuest(guest);
        hotel.addRoom(room1);
        hotel.addRoom(room2);

        Reservation reservation =
                new Reservation(
                        LocalDate.now(),
                        LocalDate.now().plusDays(2),
                        1
                );

        System.out.println("Hotel Name: " + hotel.getName());
        System.out.println("Total Rooms: " + hotel.getTotalRooms());
        System.out.println("Hotel Available: " + hotel.available());
        System.out.println("Guest Checked In Successfully");
    }
    // Main application entry point

}
