package domain;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final String name;
    private final List<Room> rooms;

    public Hotel(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException();
        }
        rooms.add(room);
    }

    public boolean available() {
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                return true;
            }
        }
        return false;
    }

    public void createReservation() {
        // UML me method defined hai
        // abhi empty rehne dete hain
    }

    public String getName() {
        return name;
    }

    public int getTotalRooms() {
        return rooms.size();
    }
}
