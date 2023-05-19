package src.home_work_3.runners;

import src.home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import src.home_work_3.calcs.simple.CalculatorWithOperator;
import src.home_work_3.calcs.simple.CalculatorWithMathExtends;
import src.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAgregation calculatorWithOperator =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());

        CalculatorWithCounterAutoChoiceAgregation calculatorWithMathCopy =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());

        CalculatorWithCounterAutoChoiceAgregation calculatorWithMathExtends =
                new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        double e = 4.1;
        double f = 2.0;
        double division = calculatorWithOperator.divisionCalculatorWithOperator(28.0, 5.0);
        double multiplication = calculatorWithOperator.multiplicationCalculatorWithOperator(15.0, 7.0);
        double addition = calculatorWithOperator.additionCalculatorWithOperator(division, multiplication, e);
        double result = calculatorWithOperator.exponentiationCalculatorWithOperator(addition);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора " + " = " + calculatorWithOperator.getCountOperationWithOperator());


        division = calculatorWithMathCopy.divisionCalculatorWithMathCopy(28.0, 5.0);
        multiplication = calculatorWithMathCopy.multiplicationCalculatorWithMathCopy(15.0, 7.0);
        addition = calculatorWithMathCopy.additionCalculatorWithMathCopy(division, multiplication, e);
        result = calculatorWithMathCopy.exponentiationMathCalculatorWithMathCopy(addition, f);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора " + " = " + calculatorWithMathCopy.getCountOperationWithOperator());

        division = calculatorWithMathExtends.divisionCalculatorWithMathExtends(28.0, 5.0);
        multiplication = calculatorWithMathExtends.multiplicationCalculatorWithMathExtends(15.0, 7.0);
        addition = calculatorWithMathExtends.additionCalculatorWithMathExtends(division, multiplication, e);
        result = calculatorWithMathExtends.exponentiationMathCalculatorWithMathExtends(addition);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора " + " = " + calculatorWithMathExtends.getCountOperationWithOperator());
    }
}
