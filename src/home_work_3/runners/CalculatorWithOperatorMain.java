package src.home_work_3.runners;

import src.home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        double e = 4.1;
        double f = 2.0;
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double division = calc.division(28.0,5.0);
        double multiplication = calc.multiplication(15.0,7.0);
        double addition = calc.addition(division,multiplication,e);
        double result = calc.exponentiation(addition);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
