package com.company;

import java.util.Scanner;

public class squareEquation {

    static void solver(double a, double b, double c) {
        double discr = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        if (discr < 0 || Double.isNaN(discr)) {
            System.out.println("no solution");
        } else if (discr == 0) {
            double result = -b / (2 * a);
            System.out.println(result);
        } else {
            double result1 = (-b + discr) / (2 * a);
            double result2 = (-b - discr) / (2 * a);
            System.out.println(result1 + " or " + result2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write a, b and c: ");
        solver(s.nextInt(), s.nextInt(), s.nextInt());
    }
}