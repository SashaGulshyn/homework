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
}
