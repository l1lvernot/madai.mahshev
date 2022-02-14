package com.company;

public class Guide_Luchshe_Bubena {
    public static void main(String[] args) {
        int integer = 3247;
        short integer_small = 329;
        long integer_big = 32482734623L;

        double drob_big = 3247.34342;
        float drob_small = 3247.3f;

        byte max_8bit = 127;
        byte min_8bit = -128;

        boolean pravda = true;
        boolean nepravda = false;

        String bukva = "g";
        String slovo = "sergey";
        String predlozheniye = "sergey igraet v dotu";

        char symbol = 'a';
        char next_symbol = (char) (symbol+1); //символы связанны с цифрами (таблица Unicode), с ними можно делать все, что и с цифрами (добавлять, отнимать и тд)
        char symbol_variant2 = '+';
        char pervaya_bukva_sergey = slovo.charAt(0); //в джаве все начинается с нуля, и строки, и отсчет цикла, и массивы




        //МАССИВ - список данных одного типа( [1], [3], [343], [12] )
        int [] massiv = new int[10]; //создание пустого массива длиной в 10 ячеек
        massiv[0] = 234; //ячееку номер [0] (первую) занимает цифра 234

        int [] vtoroy_massiv = {2,3, 45, 3343}; //массив можно инициализировать сразу полностью
        vtoroy_massiv[2] = 53; //ячейку номер [2] (третью) вместо числа 45 занимает число 53

        for (int i = 0; i < 10; i++) {
            massiv[i] = i;
            System.out.println(massiv[i]);
        }



        //Integer библиотека для управления типом данных int
        int max_chislo = Integer.MAX_VALUE; //самое большое число во всей джаве
        int min_chislo = Integer.MIN_VALUE; //самое маленькое число во всей джаве
    }
}
