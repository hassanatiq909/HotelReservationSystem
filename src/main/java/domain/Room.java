package domain;

public class Room {

    private final int number;
    private Guest occupant;

    public Room(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public void createGuest(Guest guest) {
        if (guest == null) {
            throw new IllegalArgumentException();
        }
        this.occupant = guest;
    }

    public boolean isOccupied() {
        return occupant != null;
    }

    public int getNumber() {
        return number;
    }
}
