package src.home_work_3.Calcs.simple;

/**
 * Класс ниже унаследовал 4 базовых метода из CalculatorWithOperator (шёл сверху вниз по заданиям из домашней работы,
 * и решил, что "скопировать базовые математические операции из CalculatorWithOperator" означает унаследовать, а не просто скопировать.
 * Когда спустился ниже до задания 4 осознал ошибку - там имеется тот самый класс, который должен наследовать полностью.
 */

public class CalculatorWithMathCopy extends CalculatorWithOperator {
    @Override
    public double addition(double resultOfDivision, double resultOfMultiplication, double e) {
        return super.addition(resultOfDivision, resultOfMultiplication, e);
    }

    @Override
    public double division(double a, double b) {
        return super.division(a, b);
    }

    @Override
    public double multiplication(double c, double d) {
        return super.multiplication(c, d);
    }

    @Override
    public double substraction(double a, double b) {
        return super.substraction(a, b);
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
