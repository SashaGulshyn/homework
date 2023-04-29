package src.home_work_2.loops;
import java.util.Scanner;

public class Point1_1 {
    public static void main(String[] args) {
        System.out.println("Введите положительное число до 20 включительно"); // Even if we use the long data type, factorials greater than or equal to 21 will generate an overflow.
        Scanner console = new Scanner(System.in);
        String strFromUser = console.nextLine();
        long user = Long.parseLong(strFromUser);
        if (user >= 21) {
            System.out.println("Значение получено в результате переполнения и может быть отличным от ожидаемого! Задайте положительное число до 20ти включительно.");}
        long result = 1;
        for (long i = 1; i<=user; i++){
            result = result*i;
            System.out.print(i+ "*");
        }
        System.out.println("="+ result);
    }
}
