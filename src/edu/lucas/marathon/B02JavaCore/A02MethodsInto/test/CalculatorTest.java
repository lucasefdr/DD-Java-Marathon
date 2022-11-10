package edu.lucas.marathon.B02JavaCore.A02MethodsInto.test;

import edu.lucas.marathon.B02JavaCore.A02MethodsInto.domain.Calculator;

public class CalculatorTest {
    public static void main(String... args) throws Exception {
        Calculator calculator = new Calculator();

        double numberOne = 10;
        double numberTwo = 60;

        // Passando argumentos para o nosso método
        double sum = calculator.sum(numberOne, numberTwo);
        System.out.println(sum);

        // Testando excpetion
        double division = calculator.division(10, 2);
        System.out.println(division);

        System.out.println();

        // Passagem de argumentos de tipo primitivo -> é passado uma cópia da variável passada
        calculator.modifyTwoNumbers(numberOne, numberTwo);
        System.out.println();
        System.out.println(numberOne);
        System.out.println(numberTwo);

        System.out.println();

        // Função de soma com varargs
        double sumVarArgs = calculator.sumArrayVarArgs(1, 2, 3, 4, 5, 6);
        System.out.println("varargs");
        System.out.println(sumVarArgs);
    }
}
