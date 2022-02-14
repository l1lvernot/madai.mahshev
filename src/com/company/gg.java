package com.company;

import java.util.Scanner;

public class gg {
    public static void matshalava(int a) {
        //ввод 5 чисел после чего программа должна их потытаться угадать
        int count = 0;
        for (int i = 0; i <= 50; i++) {
           int r = (int)(Math.random()*99)+1;
            // x+5 >= r && x-5 <=r
            if (a+5 >= r && a-5 <= r) {
                count ++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 6 ; i++) {
            matshalava(s.nextInt());
        }
    }
}
