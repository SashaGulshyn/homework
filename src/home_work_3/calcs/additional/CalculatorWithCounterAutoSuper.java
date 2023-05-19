package src.home_work_3.calcs.additional;

import src.home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOfOperation = 0;

    public long getCountOperation() {
        return countOfOperation;
    }

    @Override
    public double addition(double resultOfDivision, double resultOfMultiplication, double e) {
        countOfOperation++;
        return super.addition(resultOfDivision, resultOfMultiplication, e);
    }

    @Override
    public double division(double a, double b) {
        countOfOperation++;
        return super.division(a, b);
    }

    @Override
    public double multiplication(double c, double d) {
        countOfOperation++;
        return super.multiplication(c, d);
    }

    @Override
    public double substraction(double a, double b) {
        countOfOperation++;
        return super.substraction(a, b);
    }

    @Override
    public double exponentiation(double resultOfAddition, double f) {
        countOfOperation++;
        return super.exponentiation(resultOfAddition, f);
    }

    @Override
    public double module(double d) {
        countOfOperation++;
        return super.module(d);
    }

    @Override
    public double sqrt(double resultOfExponentiation) {
        countOfOperation++;
        return super.sqrt(resultOfExponentiation);
    }
}
