package src.home_work_3.calcs.additional;

import src.home_work_3.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator calculator;
    private long count = 0;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double addition(double resultOfDivision, double resultOfMultiplication, double e) {
        count++;
        return calculator.addition(resultOfDivision, resultOfMultiplication, e);
    }

    public double substraction(double a, double b) {
        count++;
        return calculator.substraction(a, b);
    }

    public double multiplication(double c, double d) {
        count++;
        return calculator.multiplication(c, d);
    }

    public double division(double a, double b) {
        count++;
        return calculator.division(a, b);
    }

    public double exponentiation(double resultOfAddition, double f) {
        count++;
        return calculator.exponentiation(resultOfAddition, f);
    }

    public double module(double d) {
        count++;
        return calculator.module(d);
    }

    public double sqrt(double resultOfExponentiation) {
        count++;
        return calculator.sqrt(resultOfExponentiation);
    }

    public long getCountOperation() {
        return count;
    }

}
