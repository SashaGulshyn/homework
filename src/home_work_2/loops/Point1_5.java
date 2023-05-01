package src.home_work_2.loops;

import java.util.Scanner;
import java.util.Random;

public class Point1_5 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число, наибольшая цифра которого будет выведена в консоль"); // 1.5.1. Найти наибольшую цифру натурального числа
        Scanner console = new Scanner(System.in);
        long user = console.nextLong();
        long max = user % 10;
        long counter = user / 10;
        do {
            if (counter % 10 > max)
                max = counter % 10;
            counter = counter / 10;
        } while (counter > 0);
        System.out.println(max);
    }

    {
        Scanner console = new Scanner(System.in); // 1.5.2. Вероятность четных случайных чисел

    }
}

