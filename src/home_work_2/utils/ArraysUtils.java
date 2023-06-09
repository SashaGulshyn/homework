package src.home_work_2.utils;

import java.util.Scanner;
import java.util.Random;

public class ArraysUtils {

    /**
     * Метод для создания массива и заполнения его введёнными пользователем элементами
     */
    public static int[] arrayFromConsole() {
        System.out.println("Задайте размер массива");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] arraySize = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элементы массива");
            Scanner elements = new Scanner(System.in);
            arraySize[i] = elements.nextInt();
        }
        return arraySize;
    }

    /**
     * Метод для наполнения массива размером 5 рандомно сгенерированными элементами
     * @param size - заданный изначально размер массива (5)
     * @param maxValueExclusion - максимальное число, в рамках которого работает рандом
     * @return - возвращает методу arrayRandom сформированный рандомными элементами массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arrayRandom = new int[size];
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            int value = rand.nextInt(maxValueExclusion);
            arrayRandom[i] = value;
        }
        return arrayRandom;
    }
}
