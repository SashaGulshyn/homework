package src.home_work_1;

import java.util.Random;

public class Point4_1 {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int firstInt = randomizer.nextInt(15);
        if (firstInt % 2 == 0) {
            System.out.println(firstInt + " - чётное число");
        } else {
            System.out.println(firstInt + " - нечётное число");
        }
    }
}
