package Leap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapTest {

    @Test
    void leapIfDivisibleBy400() {
        assertTrue(new Leap().leapIfDivisibleBy400(1600));
        assertFalse(new Leap().leapIfDivisibleBy400(1601));
    }

    @Test
    void notLeapIfDivisibleBy100not400() {
        assertTrue(new Leap().notLeapIfDivisibleBy100not400(2000));
        assertFalse(new Leap().notLeapIfDivisibleBy100not400(1700));
    }


}
