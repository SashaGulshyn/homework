package src.home_work_1;
import java.util.Scanner;
import java.util.Objects;

public class Point6_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Введите имя");
       Object a = (sc.findInLine("Вася"));
       Object b = "Вася";
        if (Objects.equals(a,b)) {
            System.out.println("Привет!\nЯ тебя так долго ждал ");
        }else{
            System.out.println("");
        }
    }
}