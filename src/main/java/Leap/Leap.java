package Leap;

public class Leap {
    public boolean leapIfDivisibleBy400(int year) {
        if (year%400==0)
            return true;
        else
            return false;
    }

    public boolean notLeapIfDivisibleBy100not400(int year) {
        if (year%100==0&&year%400==0)
            return true;
        else
            return false;
    }

    public boolean leapIfDivisibleBy4not100(int year) {
        if (year%4==0&&year%100!=0)
            return true;
        else
            return false;
    }

    public boolean notLeapIfNotDivisibleBy4(int year) {
        if(year%4!=0)
            return false;
        else
            return true;
    }

}
