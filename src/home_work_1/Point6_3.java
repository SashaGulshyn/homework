package src.home_work_1;
import java.util.Scanner;

public class Point6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя");
        if (sc.hasNext("Анастасия")) {
            System.out.println("Я тебя так долго ждал ");
        }else if (sc.hasNext("Вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }else if (sc.hasNextLine()){
            System.out.println("Добрый день,а вы кто?");
        }
    }
}