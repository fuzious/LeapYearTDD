package Leap;

public class Leap {

    //test case 1
    public boolean leapIfDivisibleBy400(int year) {
        if (year%400==0)
            return true;
        else
            return false;
    }

    //test case 2
    public boolean notLeapIfDivisibleBy100not400(int year) {
        if (year%100==0&&year%400==0)
            return true;
        else
            return false;
    }

    //test case 3
    public boolean leapIfDivisibleBy4not100(int year) {
        if (year%4==0&&year%100!=0)
            return true;
        else
            return false;
    }

    //test case 4
    public boolean notLeapIfNotDivisibleBy4(int year) {
        if(year%4!=0)
            return false;
        else
            return true;
    }

}
