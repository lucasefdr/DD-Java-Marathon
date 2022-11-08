package edu.lucas.marathon.B02JavaCore.A02MethodsInto.test;

import edu.lucas.marathon.B02JavaCore.A02MethodsInto.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double numberOne = 10;
        double numberTwo = 60;

        // passando parâmetros para o nosso método
        double sum = calculator.sum(numberOne, numberTwo);
        System.out.println(sum);
    }
}
