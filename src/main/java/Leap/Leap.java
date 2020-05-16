package Leap;

public class Leap {
    public boolean leapIfDivisibleBy400(int year) {
        if (year%400==0)
            return true;
        else
            return false;
    }
}
