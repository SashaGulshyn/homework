package src.home_work_3.calcs.simple;

import src.home_work_3.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double exponentiation(double resultOfAddition, double f) {
        double overExponentiation = Math.pow(resultOfAddition, f);
        return overExponentiation;
    }

    @Override
    public double module(double d) {
        double overModule = Math.abs(d);
        return d;
    }

    @Override
    public double sqrt(double resultOfExponentiation) {
        double overSqrt = Math.sqrt(resultOfExponentiation);
        return overSqrt;
    }

}
