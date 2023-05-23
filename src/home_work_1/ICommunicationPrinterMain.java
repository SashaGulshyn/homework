package src.home_work_1;

import java.util.Scanner;

/**
 * Класс содержит имплементацию интерфейса ICommunicationPrinter, который реализует классы с if, else if и switch методами
 * для вывода сообщения в зависимости от введённого юзером имени
 */

public class ICommunicationPrinterMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Point6_1 ifElse = new Point6_1();
        Point6_2 ifElseIf = new Point6_2();
        Point6_3 switchCase = new Point6_3();
        System.out.println("Введите имя");
        String name = scan.nextLine();

        System.out.println(ifElse.welcome(name));
    }
}
