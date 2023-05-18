package src.home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double exponentiation(double resultOfAddition) {
        double f = 2.0;
        double overExponentiation = Math.pow(resultOfAddition, f);
        return overExponentiation;
    }

    @Override
    public double module(double d, double g) {
        double overModule = Math.abs(d);
        return d;
    }

    @Override
    public double sqrt(double resultOfExponentiation) {
        double overSqrt = Math.sqrt(resultOfExponentiation);
        return overSqrt;
    }

}
