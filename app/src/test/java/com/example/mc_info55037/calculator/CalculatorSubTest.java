package com.example.mc_info55037.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorSubTest {

    private double firstOperand;
    private double secondOperand;
    private double expectedResult;

    @Test
    public void sub() {
        Calculator calculator = new Calculator();
        assertEquals(this.expectedResult, calculator.sub(this.firstOperand, this.secondOperand));
    }

    public CalculatorSubTest(double firstOperand, double secondOperand, double expectedResult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, -1.0},
                {2, 1, 1.0},
                {8, 2, 6.0},
                {-1, 6, -7.0}
        });
    }
}
