package domain;

public class RoomType {
    private final String kind;
private final double cost;

public RoomType(String kind, double cost) {
    if (kind == null || kind.isBlank()) {
        throw new IllegalArgumentException();
    }
    if (cost <= 0) {
        throw new IllegalArgumentException();
    }
    this.kind = kind;
    this.cost = cost;
}

public String getKind() {
    return kind;
}

public double getCost() {
    return cost;
}


}
