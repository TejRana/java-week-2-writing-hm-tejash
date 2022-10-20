package javaweek2hmtejash;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the Number ");
        Scanner num = new Scanner(System.in);
        number = num.nextInt();
        for (int a = 1; a <= 10; a++){
            System.out.println(number + "*" + a +"=" +number*a);
        }
    }
}
