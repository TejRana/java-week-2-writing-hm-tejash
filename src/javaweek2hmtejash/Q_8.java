package javaweek2hmtejash;

import java.util.Scanner;

public class Q_8 {

        public static void main(String[] args) {

            Scanner value = new Scanner(System.in);
            System.out.println("Enter the width for Triangle ");
            double base = value.nextDouble();

            System.out.println("Enter the height of Triangle ");
            double height = value.nextDouble();

            double area = (base*height)/2;
            System.out.println("Area of Triangle is ");
            System.out.println(+area);
        }

    }
