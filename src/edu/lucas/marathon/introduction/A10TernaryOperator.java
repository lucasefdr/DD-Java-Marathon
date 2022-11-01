package edu.lucas.marathon.introduction;

public class A10TernaryOperator {
    public static void main(String[] args) {
        // Operador ternário -> (condicao) ? true : false;
        var salary = 6000.0D;
        var messageOk = "Irei fazer uma doação de R$ 500,00";
        var messageNotOk = "Não irei fazer uma doação de R$ 500,00";

        var resultMessage = (salary > 5000) ? messageOk : messageNotOk;
        System.out.println(resultMessage);
    }
}
