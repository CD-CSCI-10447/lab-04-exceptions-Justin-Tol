package edu.desu.partB.exercises.ex02.calculator;

public class CalculatorSoln {
    public int add(int x, int y){
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(int x, int y) throws ArithmeticException {
        return x / y;
    }
}
