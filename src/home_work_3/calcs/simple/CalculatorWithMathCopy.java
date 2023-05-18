package src.home_work_3.calcs.simple;

/**
 * Класс ниже унаследовал 4 базовых метода из CalculatorWithOperator (шёл сверху вниз по заданиям из домашней работы,
 * и решил, что "скопировать базовые математические операции из CalculatorWithOperator" означает унаследовать, а не просто скопировать.
 * Когда спустился ниже до задания 4 осознал ошибку - там имеется тот самый класс, который должен наследовать полностью.
 */

public class CalculatorWithMathCopy {

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

    public double exponentiationMath (double resultOfExponentiation,double f){
        double expMath = Math.pow(resultOfExponentiation,f);
        return expMath;
    }

    public double absMath(double d) {
        double resAbs = Math.abs(d);
        return resAbs;
    }

    public double sqrtMath(double resultOfExponentiation) {
        double resSqrt = Math.sqrt(resultOfExponentiation);
        return resSqrt;
    }
}
