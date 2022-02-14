package com.company;
import java.util.Scanner;
public class work {
    public static void matebal(int a, int b) {
        int n = a;

        while (n > 0) {
            for (int i = 0; i<n; i++)
                System.out.print(b);
            System.out.println();
            n -= 1;
        }

        while (n<=a) {
            for (int i = 0; i<n; i++)
                System.out.print(b);
            System.out.println();
            n += 1;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write two numbers: ");

        matebal(s.nextInt(),s.nextInt() );
    }
}
