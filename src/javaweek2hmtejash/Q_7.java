package javaweek2hmtejash;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit :");
        float temp = scanner.nextFloat();
        Q_7 t = new Q_7();
        t.convertTempToDegreeCelsius(temp);
        scanner.close();
    }
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5/9);
        System.out.println("The temperature" + temp + "fahrenheit is equal to " + c + "degree celsius");
    }
}
