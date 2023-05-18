package src.home_work_3.runners;

import src.home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();
        double e = 4.1;
        double f = 2.0;
        double division = calcComposite.division(28.0,5.0);
        double multiplication = calcComposite.multiplication(15.0,7.0);
        double addition = calcComposite.addition(division,multiplication,e);
        double result = calcComposite.exponentiationMath(addition, f);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора " + " = " + calcComposite.countForComposite);
    }
}
