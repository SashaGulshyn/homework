package src.home_work_2.loops;

import java.util.Random;

public class Point1_5_2 {
    public static void main(String[] args) {
        System.out.println("Вероятность чётных чисел - " + ranNum() + "%");
        System.out.println("Количество чётных и нечётных чисел из числа 9653021 - " + evenOdd(9653021) + "соответственно");
        System.out.println(" - последовательность Фибоначчи для числа " + fibonacci(9));
        System.out.println(" - последовательность чисел от 6 до 96 с шагом " + step(12));
        System.out.println(" - перевёрнутое число для " + round(98612451));
    }

    private static int ranNum() {
        Random randomizer = new Random();
        int start = 0;
        int finish = 1000;
        int number;

        for (int i = 0; i <= finish; i++) {
            number = randomizer.nextInt(finish) + 1;
            if (number % 2 == 0) {
                ++start;
            }
        }
        return (int) (start * 100) / finish;
    }

    private static String evenOdd(int someInt) {
        int x = someInt;
        int even = 0;
        int odd = 0;
        int counterForX;
        do {
            counterForX = x % 10;
            x = x / 10;
            if (counterForX % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        } while (x > 0);
        return even + " чётных " + odd + " нечётных ";
    }

    private static int fibonacci(int someInt) {
        int x = someInt;
        int f1 = 1;
        int f2 = 2;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 3; i <= x; i++) {
            System.out.print(f1 + f2 + " ");
            int n = f1;
            f1 = f2;
            f2 = n + f1;
        }
        return someInt;
    }

    private static int step(int range) {
        int min = 6;
        int max = 96;
        int step1 = range;
        for (int i = min; i <= max; i += step1) {
            System.out.print(i + " ");
        }
        return range;
    }

    private static int round(int circle) {
        int n = circle;
        int m = 0;
        while (n > 0) {
            m = m * 10 + n % 10;
            n = n / 10;
        }
        System.out.print(m);
        return (circle);
    }
}