package src.home_work_1;
import java.util.Scanner;

public class Point5 {
    public static void main(String[] args) {
        System.out.println("У вас vacation? true or false?");
        Scanner sc = new Scanner(System.in);
        boolean vacation = sc.nextBoolean();
        System.out.println("Какой день недели от одного до семи?");
        int dayOfWeek = sc.nextInt();
        boolean week = false;
        if (dayOfWeek <= 5) {
            week = true;
        }else if (dayOfWeek >5 && dayOfWeek<=7){
            week = false;
        }
        boolean sleep = sleepIn(week,vacation);
        if (sleep) {
            System.out.println("Спим дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}

