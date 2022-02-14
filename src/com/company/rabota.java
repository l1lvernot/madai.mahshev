package com.company;

import java.util.Scanner;

public class rabota {
    public static void edenitsi(int n2) {
        switch (n2) {
            case 1:
                System.out.print("I");
                break;
            case 2:
                System.out.print("II");
                break;
            case 3:
                System.out.print("III");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 5:
                System.out.print("V");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 9:
                System.out.print("IX");
                break;

        }
    }

    public static void desatki(int n1) {
        String s = "";
        switch (n1) {
            case 1:
                s = "X";
                break;
            case 2:
                System.out.print("XX");
                break;
            case 3:
                System.out.print("XXX");
                break;
            case 4:
                System.out.print("XL");
                break;
            case 5:
                System.out.print("XXL");
                break;
            case 6:
                System.out.print("LX");
                break;
            case 7:
                System.out.print("LXX");
                break;
            case 8:
                System.out.print("LXXX");
                break;
            case 9:
                System.out.print("XC");
                break;
            case 10:
                System.out.print("C");
                break;
        }
    }

    public static void cod(int n) {

        if (n > 0 && n <= 100) {
            int ostatock = n % 10;
            desatki(n / 10);
                if (ostatock > 0) {
                    edenitsi(ostatock);
                }
        } else System.out.println("error");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write number: ");
        cod(s.nextInt());
    }
}
