package src.home_work_2.loops;

import java.util.Scanner;
import src.home_work_2.loops.Point1_1Main;

public class Point1_2 {
    static public String multiplayer(String consoleUser) {

        String notNumber = "Введено не число";
        if (consoleUser.matches("[a-zA-Z]+")) {
            return notNumber;
        }else if (consoleUser.matches("[0-9]+")) {
            long longFromUser = Long.parseLong(consoleUser);
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
            return String.valueOf(result);
        } else {
            String thisIsNotAWholeNumber = "Введено не целое число";
            return thisIsNotAWholeNumber;
        }
    }
}