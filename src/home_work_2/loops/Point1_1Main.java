package src.home_work_2.loops;

import src.home_work_2.loops.Point1_1;
import java.util.Scanner;

public class Point1_1Main {
    public static void main(String[] args) {
        Point1_1 loop = new Point1_1();
        System.out.println("Введите положительное число до 20 включительно");
        Scanner console = new Scanner(System.in);
        String strFromUser = console.nextLine();
        long user = Long.parseLong(strFromUser);

        System.out.println(loop.loopsTest(strFromUser, user));
    }
}
