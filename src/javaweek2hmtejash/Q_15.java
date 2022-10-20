package javaweek2hmtejash;

import java.util.Scanner;

public class Q_15 {

    public static void main(String[] args) {

        int a,b;
        System.out.println("Enter any two Numbers ");
        Scanner tej = new Scanner(System.in);
        a = tej.nextInt();
        b = tej.nextInt();
        System.out.println("Swap This Two Variable " +a+" "+b); // " space "
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Result of Swapping  " +a+ " " +b);
    }
}
