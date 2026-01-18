package domain;

public class Guest {

    private final String name;
    private final String addressDetails;

    public Guest(String name, String addressDetails) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public String getName() {
        return name;
    }

    public String getAddressDetails() {
        return addressDetails;
    }
}
