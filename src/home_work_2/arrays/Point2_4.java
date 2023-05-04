package src.home_work_2.arrays;

import src.home_work_2.utils.ArraysUtils;

public class Point2_4 {
    public static void main(String[] args) {
      int[] container = ArraysUtils.arrayRandom(50, 100);
        natural(container);
        index(container);
        less(container);
    }

    public static void natural (int[] array) {
        int[] container = array;
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (container[i] >= 0 && container[i]%2 == 0) {
                s += container[i];
            }
        }
        System.out.println("Сумма четных положительных элементов массива - " + s);
    }
    public static void index (int[] array){
        int[] container = array;
        int m = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (container[i] > container[m]) {
                m = i;
            }
        }
        System.out.println("Элемент № " + m + " хранит в себе " + container[m] + " - максимальное целое число в массиве");
    }

    public static void less (int[] array) {
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
}
