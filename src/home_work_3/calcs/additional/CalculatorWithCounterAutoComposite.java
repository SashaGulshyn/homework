package src.home_work_3.calcs.additional;


import src.home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    public CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
    public long countForComposite = 0;

    public double addition(double resultOfDivision, double resultOfMultiplication, double e) {
        countForComposite++;
        return calc.addition(resultOfDivision, resultOfMultiplication, e);
    }

    public double substraction(double a, double b) {
        countForComposite++;
        return calc.substraction(a, b);
    }

    public double multiplication(double c, double d) {
        countForComposite++;
        return calc.multiplication(c, d);
    }

    public double division(double a, double b) {
        countForComposite++;
        return calc.division(a, b);
    }

    public double exponentiationMath(double resultOfExponentiation, double f) {
        countForComposite++;
        return calc.exponentiationMath(resultOfExponentiation, f);
    }

    public double absMath(double d) {
        countForComposite++;
        return calc.absMath(d);
    }

    public double sqrtMath(double resultOfExponentiation) {
        countForComposite++;
        return calc.sqrtMath(resultOfExponentiation);
    }

    public long getCountOperation() {
        return countForComposite;
    }
}
