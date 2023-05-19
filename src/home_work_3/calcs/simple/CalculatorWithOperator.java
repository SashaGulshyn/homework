package src.home_work_3.calcs.simple;

import src.home_work_3.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
    public double exponentiation(double resultOfAddition, double f) {
        double result = resultOfAddition * resultOfAddition;
        return result;
    }

    /**
     * Модуль числа
     */
    public double module(double d) {
        double result = 0 + d;
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

