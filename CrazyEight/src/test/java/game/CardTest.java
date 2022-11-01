package game;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    void testEquals() {
        Card HeartSeven = new Card("HEART", "SEVEN");
        assertTrue(HeartSeven.equals(new Card("HEART", "SEVEN")));
    }
}
