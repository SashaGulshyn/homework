package src.home_work_3.runners;

import src.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy math = new CalculatorWithMathCopy();
        double e = 4.1;
        double f = 2.0;
        double division = math.division(28.0, 5.0);
        double multiplication = math.multiplication(15.0, 7.0);
        double addition = math.addition(division, multiplication, e);
        double result = math.exponentiation(addition, f);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
