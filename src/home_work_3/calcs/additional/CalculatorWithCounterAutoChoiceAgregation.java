package src.home_work_3.calcs.additional;

import src.home_work_3.calcs.simple.CalculatorWithMathCopy;
import src.home_work_3.calcs.simple.CalculatorWithMathExtends;
import src.home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    private long count = 0;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public double additionCalculatorWithOperator(double resultOfDivision, double resultOfMultiplication, double e) {
        count++;
        return calculatorWithOperator.addition(resultOfDivision, resultOfMultiplication, e);
    }

    public double substractionCalculatorWithOperator(double a, double b) {
        count++;
        return calculatorWithOperator.substraction(a, b);
    }

    public double multiplicationCalculatorWithOperator(double c, double d) {
        count++;
        return calculatorWithOperator.multiplication(c, d);
    }

    public double divisionCalculatorWithOperator(double a, double b) {
        count++;
        return calculatorWithOperator.division(a, b);
    }

    public double exponentiationCalculatorWithOperator(double resultOfExponentiation) {
        count++;
        return calculatorWithOperator.exponentiation(resultOfExponentiation);
    }

    public double moduleCalculatorWithOperator(double d, double g) {
        count++;
        return calculatorWithOperator.module(d, g);
    }

    public double sqrtCalculatorWithOperator(double resultOfExponentiation) {
        count++;
        return calculatorWithOperator.sqrt(resultOfExponentiation);
    }

    public long getCountOperationWithOperator() {
        return count;
    }

    public double additionCalculatorWithMathCopy(double resultOfDivision, double resultOfMultiplication, double e) {
        count++;
        return calculatorWithMathCopy.addition(resultOfDivision, resultOfMultiplication, e);
    }

    public double substractionCalculatorWithMathCopy(double a, double b) {
        count++;
        return calculatorWithMathCopy.substraction(a, b);
    }

    public double multiplicationCalculatorWithMathCopy(double c, double d) {
        count++;
        return calculatorWithMathCopy.multiplication(c, d);
    }

    public double divisionCalculatorWithMathCopy(double a, double b) {
        count++;
        return calculatorWithMathCopy.division(a, b);
    }

    public double exponentiationMathCalculatorWithMathCopy(double resultOfExponentiation, double f) {
        count++;
        return calculatorWithMathCopy.exponentiationMath(resultOfExponentiation, f);
    }

    public double absMathCalculatorWithMathCopy(double d) {
        count++;
        return calculatorWithMathCopy.absMath(d);
    }

    public double sqrtMathCalculatorWithMathCopy(double resultOfExponentiation) {
        count++;
        return calculatorWithMathCopy.sqrtMath(resultOfExponentiation);
    }

    public long getCountOperationWithMathCopy() {
        return count;
    }

    public double additionCalculatorWithMathExtends(double resultOfDivision, double resultOfMultiplication, double e) {
        count++;
        return calculatorWithMathExtends.addition(resultOfDivision, resultOfMultiplication, e);
    }

    public double substractionCalculatorWithMathExtends(double a, double b) {
        count++;
        return calculatorWithMathExtends.substraction(a, b);
    }

    public double multiplicationCalculatorWithMathExtends(double a, double b) {
        count++;
        return calculatorWithMathExtends.multiplication(a, b);
    }

    public double divisionCalculatorWithMathExtends(double a, double b) {
        count++;
        return calculatorWithMathExtends.division(a, b);
    }

    public double exponentiationMathCalculatorWithMathExtends(double resultOfAddition) {
        count++;
        return calculatorWithMathExtends.exponentiation(resultOfAddition);
    }

    public double moduleMathCalculatorWithMathExtends(double d, double g) {
        count++;
        return calculatorWithMathExtends.module(d, g);
    }

    public double sqrtMathCalculatorWithMathExtends(double resultOfExponentiation) {
        count++;
        return calculatorWithMathExtends.sqrt(resultOfExponentiation);
    }

    public long getCountOperationWithMathExtends() {
        return count;
    }
}
