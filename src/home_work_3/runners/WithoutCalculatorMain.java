package src.home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        double f = (a + b * c + (d / e));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + (f * f));
    }
}
