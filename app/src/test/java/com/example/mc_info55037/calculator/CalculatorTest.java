package com.example.mc_info55037.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void หนึ่งบวกหนึ่งเท่ากับสอง() {
        //focus แยกแต่ละเคส
        //Arrange

        //Act

        //Assert
        assertEquals(2, calculator.addplus(1, 1), 0);
        //assertEquals(2.0, actualResult);
    }

    @Test
    public  void ลบ() {
        assertEquals(0.0, calculator.sub(1, 1));
        assertEquals(6.0, calculator.sub(7, 1));
    }

    @Test
    public void สองคูณสามเท่ากับหก() {
        assertEquals(6.0, calculator.multiply(2, 3));
    }

    @Test
    public void สามหารหนึ่งเท่ากับสาม() {
        assertEquals(3.0, calculator.divide(3, 1));
    }

    @Test(expected = DivideByZeroException.class)
    public void สองหารศูนย์จะเกิดข้อผิดพลาด_DivideByZeroException() {
        calculator.divide(2, 0);
    }

    /*
    @Test
    public void สองหารศูนย์จะเกิดข้อผิดพลาด_DivideByZeroException() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(2, 0);
            fail("stupid");
        } catch (DivideByZeroException e) {

        }
    }*/
}
