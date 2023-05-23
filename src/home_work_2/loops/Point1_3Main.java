package src.home_work_2.loops;

import java.util.Scanner;

public class Point1_3Main {
    public static void main(String[] args) {
        Point1_3 degr = new Point1_3();
        System.out.println("Введите дробное число, которое будет возведено в степень (может быть отрицательным)");
        Scanner console = new Scanner(System.in);
        String consoleUser = String.valueOf(console.nextDouble());
        System.out.println("Введите целое положительное число - степень, в которую возведём первое число");
        int intFromUser2 = console.nextInt();

        System.out.println(Point1_3.degree(consoleUser,intFromUser2));
    }
}
