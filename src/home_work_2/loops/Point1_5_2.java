package src.home_work_2.loops;

import java.util.Random;

public class Point1_5_2 {

    public static int ranNum() {
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

    public static String evenOdd(int someInt) {
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

    public static int fibonacci(int someInt) {
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

    public static int step(int range) {
        int min = 6;
        int max = 96;
        int step1 = range;
        for (int i = min; i <= max; i += step1) {
            System.out.print(i + " ");
        }
        return step1;
    }

    public static int round(int circle) {
        int n = circle;
        int m = 0;
        while (n > 0) {
            m = m * 10 + n % 10;
            n = n / 10;
        }
        System.out.print(m);
        return m;
    }
}