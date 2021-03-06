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

    @Test
    void leapIfDivisibleBy4not100() {
        assertTrue(new Leap().leapIfDivisibleBy4not100(1996));
        assertFalse(new Leap().leapIfDivisibleBy4not100(1700));
    }

    @Test
    void notLeapIfNotDivisibleBy4() {
        assertTrue(new Leap().notLeapIfNotDivisibleBy4(2000));
        assertFalse(new Leap().notLeapIfNotDivisibleBy4(1997));
    }
}
