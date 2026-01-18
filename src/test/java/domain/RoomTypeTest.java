package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTypeTest {

    @Test
    public void shouldCreateRoomTypeSuccessfully() {
        RoomType roomType = new RoomType("Deluxe", 5000);

        assertEquals("Deluxe", roomType.getKind());
        assertEquals(5000, roomType.getCost());
    }

    @Test
    public void shouldThrowExceptionForInvalidCost() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new RoomType("Deluxe", -10)
        );
    }
}
