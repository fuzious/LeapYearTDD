package Leap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //taking input via scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year ");
        int year= scanner.nextInt();

        // using Leap class
        Leap ob=new Leap();
        if ((ob.leapIfDivisibleBy400(year))||(ob.leapIfDivisibleBy4not100(year)))
            System.out.println("yes ,its a leap year");
        else
            System.out.println("no, its not a leap year");
    }
}
