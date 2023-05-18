package src.home_work_3.runners;

import src.home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic counterCalc = new CalculatorWithCounterClassic();
        double e = 4.1;
        double f = 2.0;
        double division = counterCalc.division(28.0, 5.0);
        counterCalc.incrementCountOperation();

        double multiplication = counterCalc.multiplication(15.0, 7.0);
        counterCalc.incrementCountOperation();

        double addition = counterCalc.addition(division, multiplication, e);
        counterCalc.incrementCountOperation();

        double result = counterCalc.exponentiation(addition);
        counterCalc.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество проведённых операций " + " = " + counterCalc.getCountOperation());
    }
}
