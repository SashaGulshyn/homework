package src.home_work_3.runners;

import src.home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import src.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregation calculator;
        CalculatorWithMathCopy CalculatorWithMathCopy = new CalculatorWithMathCopy();
        calculator = new CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy);

        double e = 4.1;
        double f = 2.0;
        double division = calculator.division(28.0, 5.0);
        double multiplication = calculator.multiplication(15.0, 7.0);
        double addition = calculator.addition(division, multiplication, e);
        double result = calculator.exponentiationMath(addition, f);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора " + " = " + calculator.getCountOperation());
    }
}
