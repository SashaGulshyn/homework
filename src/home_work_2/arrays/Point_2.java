package src.home_work_2.arrays;

import java.util.Arrays;

import static src.home_work_2.utils.ArraysUtils.arrayFromConsole;

public class Point_2 {

    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println("Был создан массив со следующими элементами: " + Arrays.toString(container));
    }
}

