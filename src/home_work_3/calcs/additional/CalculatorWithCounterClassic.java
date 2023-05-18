package src.home_work_3.calcs.additional;

import src.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long counter = 0;

    /**
     * Метод для увеличения внутреннего счётчика (поля) в калькуляторе
     */

    public void incrementCountOperation() {
        counter++;
    }

    /**
     * Метод для возврата количества использований калькулятора (поле)
     */
    public long getCountOperation() {
        return counter;
    }
}
