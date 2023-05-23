package src.home_work_1;

import java.util.Arrays;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber());
    }
    public static String createPhoneNumber () {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        return "(" + array[0] + array [1] + array[2] +") " + array[3] + array [4] + array [5] +
                "-" + array[6] + array[7] + array[8] + array[9];
    }
}
