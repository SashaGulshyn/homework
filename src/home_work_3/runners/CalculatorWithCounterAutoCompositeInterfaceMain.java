package src.home_work_3.runners;

import src.home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import src.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        double e = 4.1;         //Поздно осознал свою ошибку - решил, что т.к. мы знаем степень из уравнения, то можно
        double f = 2.0;         //указать её как переменную. Как и в случае с первым числом (4.1) это можно/нужно было
                                // реализовывать внутри методов, но я побоялся всё менять уже после построения архитектуры
        double division = calculator.division(28.0, 5.0);
        double multiplication = calculator.multiplication(15.0, 7.0);
        double addition = calculator.addition(division, multiplication, e);
        double result = calculator.exponentiation(addition, f);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество проведённых операций " + " = " + calculator.getCountOperation());
    }
}
