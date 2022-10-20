package javaweek2hmtejash;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Addition();
        Subtraction();
        Q_5 abc = new Q_5();
        abc.multiplication();

    }
    public  static void Addition() {
        int a, b;
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter first number");
        a = tej.nextInt();
        System.out.println("Enter Second number");
        b = tej.nextInt();
        int c = a + b;
        System.out.println("Addition of two numbers ");
        System.out.println(+c);
    }
    public static void Subtraction(){
        int c,d;
        Scanner rana = new Scanner(System.in);
        System.out.println("Enter first number");
        c = rana.nextInt();
        System.out.println("Enter Second number");
        d = rana.nextInt();
        int e = c - d;
        System.out.println("Subtraction of two number");
        System.out.println(-e);
    }
    public void multiplication() {
        int  n,m;
        Scanner dom = new Scanner(System.in);
        System.out.println("Enter first number");
        n = dom.nextInt();
        System.out.println("Enter second number");
        m = dom.nextInt();
        int l = n * m;
        System.out.println("Multiplication of two number");
        System.out.println(l);
    }
    public void Division() {
        int r,f;
        Scanner tom = new Scanner(System.in);
        System.out.println("Enter first number");
        r = tom.nextInt();
        System.out.println("Enter second number");
        f = tom.nextInt();
        int g = r/f;
        System.out.println("Division of two number");
        System.out.println(g);
    }
}
