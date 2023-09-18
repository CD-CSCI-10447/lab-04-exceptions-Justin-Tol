package edu.desu.partB;

import edu.desu.partA.ProblemA;
import edu.desu.partB.exercises.ex02.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void addTest() {
        //given
        Calculator calc = new Calculator();
        int inputX = 1;
        int inputY = 2;

        //when
        int expected = 3;
        int actual = calc.add(inputX, inputY);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideTest01() {
        //given
        Calculator calc = new Calculator();
        int inputX = 8;
        int inputY = 2;

        //when
        int expected = 4;
        double actual = calc.divide(inputX, inputY);

        Assertions.assertEquals(expected, actual);
    }

    /*
    @Test
    public void divideTest02() {
        //given
        Calculator calc = new Calculator();
        int inputX = 8;
        int inputY = 0;

        //when
        ArithmeticException expected = new ArithmeticException("Cannot divide by zero.");

        double actual = calc.divide(inputX, inputY);

        Assertions.assertThrows(expected, );
    }

     */
}
