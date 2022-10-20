package javaweek2hmtejash;

import java.util.Scanner;

public class Q_17 {

    public static void main(String[] args) {

        System.out.println("Welcome to java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the decimal Number: ");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        scanner.close();
    }
    public static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("the binary value is : " + binary);
    }
}
