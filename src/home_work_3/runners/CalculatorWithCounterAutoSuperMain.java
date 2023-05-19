package src.home_work_3.runners;

import src.home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calcWithCounter = new CalculatorWithCounterAutoSuper();

        double e = 4.1;
        double f = 2.0;
        double division = calcWithCounter.division(28.0, 5.0);

        double multiplication = calcWithCounter.multiplication(15.0, 7.0);

        double addition = calcWithCounter.addition(division, multiplication, e);

        double result = calcWithCounter.exponentiation(addition, f);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество проведённых операций " + " = " + calcWithCounter.getCountOperation());
    }
}
