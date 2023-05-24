package src.home_work_2.arrays;

import src.home_work_2.utils.ArraysUtils;

public class Point2_4 {

    /**
     * Метод для нахождения суммы чётных положительных элементов массива
     */
    public static int natural(int[] array) {
        int[] container = array;
        int s = 0;
        for (int i = 0; i < container.length; i++) {
                s += container[i];
            }
        return s;
    }

    /**
     * Метод для нахождения позиции элемента с максимальным числом в массиве
     */
    public static int index(int[] array) {
        int[] container = array;
        int m = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (container[i] > container[m]) {
                m = i;
            }
        }
        System.out.print("Элемент № " + m);
        return container[m];
    }

    /**
     * Метод для подсчёта среднего арифметического
     */
    public static double average(int[] array) {
        int[] container = array;
        double avrg = 0;
        for (int i = 0; i < container.length; i++) {
            avrg += container[i];
        }
        double average = avrg / container.length;
        int cell = (int) average;
        return average;
    }

    /**
     * Метод для поиска двух наименьших элементов массива
     */
    public static int minimum(int[] array) {
        int[] container = array;
        int min1 = 1;
        int min2 = 2;
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
        return min2;
    }


    /**
     * Метод обращается к первому элементу массива и записывает в переменную для подсчёта суммы остаток от деления на 10 -
     * сначала присваивая переменной дробную часть, а после целочисленную. Цикл заканчивается, когда счётчик достигает "длина массива - 1"
     */
    static int summa(int[] array) {
        int[] container = array;
        int start = 0;
        int one = array[0];
        for (int i = 0; i < array.length; i++) {
            int b = array[i];
            start += b % 10;
            start += b / 10;
        }
        return start;
    }
}
