package src.home_work_2.loops;

import static src.home_work_2.loops.Point1_5_2.*;

public class Point1_5_2Main {
    public static void main(String[] args) {
        System.out.println("Вероятность чётных чисел - " + ranNum() + "%");
        System.out.println("Количество чётных и нечётных чисел из числа 9653021 - " + evenOdd(9653021) + "соответственно");
        System.out.println(" - последовательность Фибоначчи для числа " + fibonacci(8));
        System.out.println(" - последовательность чисел от 6 до 96 с шагом " + step(12));
        System.out.println(" - перевёрнутое число для " + round(98612451));
    }
}
