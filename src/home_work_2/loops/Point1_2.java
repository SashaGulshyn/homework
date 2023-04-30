package src.home_work_2.loops;

import java.util.Scanner;

public class Point1_2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число, цифры из которого будут перемножены между собой");
        Scanner console = new Scanner(System.in);
        if (!console.hasNextDouble()) {
            System.out.println("Введено не число");
        } else {
            if (console.hasNextDouble() && console.hasNextLong()) {
                long longFromUser = console.nextLong();
                long result = 1;
                long secondSymbol = 1;
                for (int i = String.valueOf(longFromUser).length(); i > 0; i--) {
                    secondSymbol = longFromUser % 10;
                    result = result * secondSymbol;
                    if (longFromUser / 10 != 0) {
                        System.out.print(secondSymbol + "*");
                    } else {
                        System.out.print(secondSymbol + "=");
                    }
                    longFromUser = longFromUser / 10;
                }
                System.out.print(result);
            } else {
                System.out.println("Введено не целое число");
            }
        }
    }
}
