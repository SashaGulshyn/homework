package src.home_work_2.arrays;

import src.home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.ArrayList;


public class Point2_4 {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(50, 100);
        natural(container);
        index(container);
        less(container);
        minimum(container);
        summa(container);
    }

    /**
     * Метод для нахождения суммы чётных положительных элементов массива
     */
    public static void natural(int[] array) {
        int[] container = array;
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (container[i] >= 0 && container[i] % 2 == 0) {
                s += container[i];
            }
        }
        System.out.println("Сумма четных положительных элементов массива - " + s);
    }

    /**
     * Метод для нахождения позиции элемента с максимальным числом в массиве
     */
    public static void index(int[] array) {
        int[] container = array;
        int m = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (container[i] > container[m]) {
                m = i;
            }
        }
        System.out.println("Элемент № " + m + " хранит в себе " + container[m] + " - максимальное целое число в массиве");
    }

    /**
     * Метод для подсчёта среднего арифметического и элементов массива, которые меньше его
     */
    public static void less(int[] array) {
        int[] container = array;
        double avrg = 0;
        for (int i = 0; i < container.length; i++) {
            avrg += container[i];
        }
        double average = avrg / container.length;
        int cell = (int) average;
        System.out.println(average + " - среднее арифметическое массива");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < cell) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("- элементы массива, которые меньше среднего арифметического");
    }

    /**
     * Метод для поиска двух наименьших элементов массива
     */
    public static void minimum(int[] array) {
        int[] container = array;
        if (array[0] < array[1]) {
            int min1 = 1;
            int min2 = 2;
        } else {
            int min1 = 2;
            int min2 = 1;

            for (int i = 2; i < array.length; i++) {
                if (array[i] < array[min1]) {
                    int buff = min1;
                    min1 = i;
                    if (array[buff] < array[min2]) {
                        min2 = buff;
                    }
                } else if (array[i] < array[min2]) {
                    min2 = i;
                }
            }
            System.out.print("№" + min1 + " : " + array[min1] + "; ");
            System.out.print("№" + min2 + " : " + array[min2] + " - два наименьших элемента массива");
        }
        System.out.println();
    }
    

    /**
     * Метод обращается к первому элементу массива и записывает в переменную для подсчёта суммы остаток от деления на 10 -
     * сначала присваивая переменной дробную часть, а после целочисленную. Цикл заканчивается, когда счётчик достигает "длина массива - 1"
     */
    private static void summa(int[] array) {
        int[] container = array;
        int start = 0;
        int one = array[0];
        for (int i = 0; i < array.length; i++) {
            int b = array[i];
            start += b % 10;
            start += b / 10;
        }
        System.out.println(start + " - сумма цифр массива");
    }
}
