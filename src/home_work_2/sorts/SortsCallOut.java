package src.home_work_2.sorts;

import src.home_work_2.utils.ArraysUtils;
import src.home_work_2.sorts.SortsUtils;

import java.util.Arrays;

public class SortsCallOut {
    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Состояние массива до сортировки: " + Arrays.toString(first));
        SortsUtils.bubble(first);
        System.out.println("Состояние массива после сортировки пузырьком: " + Arrays.toString(first));

        int[] second = new int[]{1,1,1,1};
        System.out.println("Состояние массива до сортировки: " + Arrays.toString(second));
        System.out.println("Состояние массива после сортировки пузырьком: " + Arrays.toString(second));

        int[] third = new int[]{9,1,5,99,9,9};
        System.out.println("Состояние массива до сортировки: " + Arrays.toString(third));
        System.out.println("Состояние массива после сортировки пузырьком: " + Arrays.toString(third));

        int[] forth = new int[]{};
        System.out.println("Состояние массива до сортировки: " + Arrays.toString(forth));
        System.out.println("Состояние массива после сортировки пузырьком: " + Arrays.toString(forth));

        int[] five = new int[]{6,5,4,3,2,1};
        System.out.println("Состояние массива до сортировки: " + Arrays.toString(five));
        System.out.println("Состояние массива после сортировки пузырьком: " + Arrays.toString(five));
    }

}
