package src.home_work_2.loops;
import src.home_work_2.loops.Point1_1Main;

public class Point1_1 {
    static public String loopsTest(String strFromUser, long user) {
        String back = null;
        if (user >= 21) {
            return strFromUser + " - Значение получено в результате переполнения и может быть отличным от ожидаемого!" +
                    "Задайте положительное число до 20ти включительно.";
        } else {
            long result = 1;
            for (long i = 1; i <=user; i++) {
                result = result * i;
                back = "" + result;
                if (i == user){
                    System.out.print(i + " = ");
                    break;
                }
                System.out.print(i + " * ");
            }
        }
        return back;
    }
}
