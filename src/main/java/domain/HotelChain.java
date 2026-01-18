package domain;

public class HotelChain {

    private final String name;

    public HotelChain(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public void makeReservation() {
        // UML method
    }

    public void cancelReservation() {
        // UML method
    }

    public void checkInGuest() {
        // UML method
    }

    public void checkOutGuest() {
        // UML method
    }

    public void createReserverPayer() {
        // UML method
    }

    public String getName() {
        return name;
    }
}
