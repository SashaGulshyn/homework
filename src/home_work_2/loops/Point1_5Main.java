package src.home_work_2.loops;

import java.util.Scanner;
import src.home_work_2.loops.Point1_5;

public class Point1_5Main {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число, наибольшая цифра которого будет выведена в консоль"); // 1.5.1. Найти наибольшую цифру натурального числа
        Scanner console = new Scanner(System.in);
        long natural = console.nextLong();

        System.out.println(Point1_5.maxFromUser(natural) + "Наибольшая цифра");
    }
}
