package src.home_work_2.loops;

import src.home_work_2.loops.Point1_2;
import java.util.Scanner;

public class Point1_2Main {
    public static void main(String[] args) {
        Point1_2 multi = new Point1_2();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число, цифры из которого будут перемножены между собой");
        String consoleUser = console.nextLine();

        System.out.println(Point1_2.multiplayer(consoleUser));
    }
}
