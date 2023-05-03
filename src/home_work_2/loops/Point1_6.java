package src.home_work_2.loops;

public class Point1_6 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения" + "\n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " * " + i + " = ");
                System.out.print(j * i + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("");
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " * " + i + " = ");
                System.out.print(j * i + "\t");
            }
            System.out.print("\n");
        }
    }
}
