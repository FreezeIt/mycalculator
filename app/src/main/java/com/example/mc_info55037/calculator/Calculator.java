package com.example.mc_info55037.calculator;

public class Calculator {
    public double addplus(double firstOperand, double secondOperand) {
        return firstOperand+secondOperand;
    }

    public double multiply(double firstOperand, double secondOperand) {
        return firstOperand*secondOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        return firstOperand-secondOperand;
    }

    public double divide(double firstOperand, double secondOperand) {
        if (secondOperand == 0) {
            throw new DivideByZeroException();
        }
        return firstOperand/secondOperand;
    }
}
