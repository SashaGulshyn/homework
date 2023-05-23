package src.home_work_2.loops;

import java.util.Scanner;

public class Point1_3 {

    static public String degree(String consoleUser,int intFromUser2) {

        String notNumber = "Введено не число";
        if (consoleUser.matches("[a-zA-Z]+")) {
            return notNumber;
        } else {
            if (consoleUser.contains(".")) {
                float floatFromUser = Float.parseFloat(consoleUser);
                int counter = 1;
                double result = 1;
                do {
                    result = floatFromUser * result;
                    counter++;
                } while (counter <= intFromUser2);
                return (floatFromUser + " ^ " + intFromUser2 + " = " + result);
            } else {
                return "Введено не дробное число! Используйте . для разделения!";
            }
        }
    }
}