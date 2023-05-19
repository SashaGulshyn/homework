package src.home_work_3.runners;

import src.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcmath = new CalculatorWithMathExtends();
        double e = 4.1;
        double f = 2.0;
        double division = calcmath.division(28.0, 5.0);
        double multiplication = calcmath.multiplication(15.0, 7.0);
        double addition = calcmath.addition(division, multiplication, e);
        double result = calcmath.exponentiation(addition, f);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
