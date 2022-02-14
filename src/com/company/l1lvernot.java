package com.company;

import java.util.Scanner;

public class l1lvernot {
   /* public static int xyi() {
        int count = 0;

        Scanner s = new Scanner(System.in);
        int x = (int) (Math.random() * 99) + 1;

        System.out.println("write 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int guess = s.nextInt();
            if ((x + 5) > guess && (x - 5) < guess) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(xyi());
    }
    */

/*
    static int n = 0;
    static boolean a = true;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        n = s.nextInt();
        a = xyi(n);
        System.out.println(a);

    }

    static public boolean xyi(int n) {
        int n1, n2;
        while (n > 0 && a) {
            n1 = n % 10;
            n2 = (n / 10) % 10;
            if (n1 == n2)
                a = true;
            else
                a = false;
            n = n / 100;
        }
        return a;

 */


    static int x = 0, y = 0, h, a;
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        xyi();
        System.out.println("The winner reached the height of "+x+" meters and used "+y+" hooks");

    }

    public static void xyi() {
        for (int i = 0; i < 30; i++) {
            System.out.println("enter the height that you reached: ");
            System.out.println("enter the amount of hooks that you used: ");
            h = s.nextInt();
            a = s.nextInt();
            smth();}
    }
    public static void smth (){
        if (h>x){
            x=h;
            y=a;}
        else if (x==h){
            if (y>a)
                y=a;
        }

    }
}



