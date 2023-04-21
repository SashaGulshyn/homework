package src.home_work_1;
import java.util.Scanner;

public class Point6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Введите имя");
        name = sc.nextLine();
        switch (name){
            case "Вася":
                System.out.println("Привет! Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}