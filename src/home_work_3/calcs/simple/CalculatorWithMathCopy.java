package src.home_work_3.calcs.simple;

import src.home_work_3.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double addition(double resultOfDivision, double resultOfMultiplication, double e) {
        double result = resultOfDivision + resultOfMultiplication + e;
        return result;
    }

    /**
     * Метод вычитания
     */
    public double substraction(double a, double b) {
        double result = a - b;
        return result;
    }

    /**
     * Метод умножения
     */
    public double multiplication(double c, double d) {
        double result = c * d;
        return result;
    }

    /**
     * Метод деления
     */
    public double division(double a, double b) {
        double result = a / b;
        return result;
    }

    public double exponentiation(double resultOfExponentiation, double f) {
        double expMath = Math.pow(resultOfExponentiation, f);
        return expMath;
    }

    public double module(double d) {
        double resAbs = Math.abs(d);
        return resAbs;
    }

    public double sqrt(double resultOfExponentiation) {
        double resSqrt = Math.sqrt(resultOfExponentiation);
        return resSqrt;
    }
}
