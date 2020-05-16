package Leap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapTest {

    @Test
    void leapIfDivisibleBy400() {
        assertTrue(new Leap().leapIfDivisibleBy400(1600));
        assertFalse(new Leap().leapIfDivisibleBy400(1601));
    }
}
