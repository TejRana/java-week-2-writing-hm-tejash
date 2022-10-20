package javaweek2hmtejash;

import java.util.Scanner;

public class Q_14 {

    public static void areaPerimeter_Rectangle_Q14(int height, int width) {
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle :");
        int height = scanner.nextInt();
        System.out.println("Enter the height of the rectangle :");
        int width = scanner.nextInt();
        areaPerimeter_Rectangle_Q14(height, width);
        scanner.close();
    }
}
