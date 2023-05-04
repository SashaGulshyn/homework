package src.home_work_2.arrays;

import java.util.Arrays;

import static src.home_work_2.utils.ArraysUtils.arrayRandom;

public class Point2_1_2 {
    public static void main(String[] args) {
        int[] container = arrayRandom(5,100);
        System.out.println("Был создан массив со следующими элементами: " + Arrays.toString(container));
    }
}
