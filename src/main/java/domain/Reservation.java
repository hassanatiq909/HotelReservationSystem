package domain;

import java.time.LocalDate;

public class Reservation {

    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int number;

    public Reservation(LocalDate startDate, LocalDate endDate, int number) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException();
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException();
        }
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getNumber() {
        return number;
    }
}
