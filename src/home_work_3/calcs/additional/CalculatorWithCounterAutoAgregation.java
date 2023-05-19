package src.home_work_3.calcs.additional;

import src.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculator;
    private long counter = 0;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator){
        this.calculator = calculator;
    }

    public double addition(double resultOfDivision, double resultOfMultiplication, double e){
        counter++;
        return calculator.addition(resultOfDivision,resultOfMultiplication,e);
    }

    public double substraction(double a, double b) {
        counter++;
        return calculator.substraction(a, b);
    }

    public double multiplication(double c, double d) {
        counter++;
        return calculator.multiplication(c, d);
    }

    public double division(double a, double b) {
        counter++;
        return calculator.division(a, b);
    }

    public double exponentiationMath(double resultOfExponentiation, double f) {
        counter++;
        return calculator.exponentiationMath(resultOfExponentiation, f);
    }

    public double absMath(double d) {
        counter++;
        return calculator.absMath(d);
    }

    public double sqrtMath(double resultOfExponentiation) {
        counter++;
        return calculator.sqrtMath(resultOfExponentiation);
    }

    public long getCountOperation() {
        return counter;
    }
}
