package src.home_work_2.loops;

import java.util.Scanner;

public class Point1_3 {
    public static void main(String[] args) {
        System.out.println("Введите дробное число, которое будет возведено в степень (может быть отрицательным)");
        Scanner console = new Scanner(System.in);
        if (!console.hasNextDouble()) {
            System.out.println("Введено не число");
        } else {
            if (console.hasNextDouble() && !console.hasNextLong()) {
                float floatFromUser = console.nextFloat();
                byte first = (byte) floatFromUser;
                System.out.println("Введите целое положительное число - степень, в которую возведём первое число");
                int intFromUser2 = console.nextInt();
                int counter = 1;
                double result = 1;
                do {
                    result = first * result;
                    counter++;
                } while (counter <= intFromUser2);
                System.out.println(first + " ^ " + intFromUser2 + " = " + result);
            } else {
                System.out.println("Введено не дробное число! Используйте . для разделения!");
            }
        }

    }
}