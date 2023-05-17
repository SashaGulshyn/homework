package src.home_work_3.Calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    double a = 28.0;
    double b = 5.0;
    public double addition(double resultOfDivision, double resultOfMultiplication, double e) {
        return super.addition(resultOfDivision, resultOfMultiplication, e);
    }

    public double division(double a, double b) {
        return super.division(a, b);
    }

    public double multiplication(double c, double d) {
        return super.multiplication(c, d);
    }

    public double substraction(double a, double b) {
        return super.substraction(a, b);
    }

    @Override
    public double exponentiation(double resultOfAddition) {
        double f = 2.0;
        double overExponentiation = Math.pow(resultOfAddition,f);
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
