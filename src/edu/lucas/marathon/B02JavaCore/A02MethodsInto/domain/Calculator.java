package edu.lucas.marathon.B02JavaCore.A02MethodsInto.domain;

/**
 * Classe criada para treinamento de <b>métodos</b> (ações)
 */
public class Calculator {

    // Nosso métodos recebem parâmetros
    public double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public double division(double numberOne, double numberTwo) throws Exception {
        if (numberTwo == 0) throw new Exception("Can't divide by 0");
        return numberOne * numberTwo;
    }
}
