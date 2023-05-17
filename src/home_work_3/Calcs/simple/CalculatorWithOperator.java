package src.home_work_3.Calcs.simple;


public class CalculatorWithOperator {
    public static void main(String[] args) {
        double a = 28;
        double b = 5;
        double c = 7;
        double d = 15;
        double e = 4.1;
        double f = 2.0;
        double g = 0.0;
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double resultOfSubstraction = calc.substraction(a, b);
        double resultOfMultiplication = calc.multiplication(c, d);
        double resultOfDivision = calc.division(a, b);
        double resultOfAddition = calc.addition(resultOfDivision, resultOfMultiplication, e);
        double resultOfExponentiation = calc.exponentiation(resultOfAddition);
        double resultOfSqrt = calc.sqrt(resultOfExponentiation);
        double resultOfModule = calc.module(d, g);
    }

    /**
     * Метод сложения
     */
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

    /**
     * Возведение в степень
     */
    public double exponentiation(double resultOfAddition) {
        double result = resultOfAddition * resultOfAddition;
        return result;
    }

    /**
     * Модуль числа
     */
    public double module(double d, double g) {
        double result = g + d;
        return result;
    }

    /**
     * Квадратный корень
     */
    public double sqrt(double resultOfExponentiation) {
        double result = resultOfExponentiation * resultOfExponentiation;
        return result;
    }
}

