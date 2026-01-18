package domain;

public class ReserverPayer {

    private final String creditCardDetails;
    private final String id;

    public ReserverPayer(String creditCardDetails, String id) {
        if (creditCardDetails == null || creditCardDetails.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.creditCardDetails = creditCardDetails;
        this.id = id;
    }

    public void create() {
        // UML me method defined hai
        // is stage par empty rehne dete hain
    }

    public String getCreditCardDetails() {
        return creditCardDetails;
    }

    public String getId() {
        return id;
    }
}
