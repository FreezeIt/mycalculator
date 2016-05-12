package com.example.mc_info55037.calculator;

/**
 * Created by mc-info55037 on 5/11/16 AD.
 */
public class MainController {
    Calculator calculator = new Calculator();
    CalculatorListener listener;

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void add(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.addplus(firstOperand, secondOperand)));
    }

    public void sub(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.sub(firstOperand, secondOperand)));
    }

    public void div(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.divide(firstOperand, secondOperand)));
    }

    public void mul(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.multiply(firstOperand, secondOperand)));
    }
}
