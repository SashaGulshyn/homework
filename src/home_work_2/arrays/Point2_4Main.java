package src.home_work_2.arrays;

import src.home_work_2.utils.ArraysUtils;
import static src.home_work_2.arrays.Point2_4.*;


public class Point2_4Main {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Сумма четных положительных элементов массива - " + natural(container));
        System.out.println(" хранит в себе " + index(container) + " - максимальное целое число в массиве");
        System.out.println(average(container)+ " - среднее арифметическое массива");
        System.out.println("и №" + minimum(container) + " - два наименьших элемента массива");
        System.out.println(summa(container) + " - сумма цифр массива");
    }
}
