package edu.lucas.marathon.B01Introduction;

public class A05RelationalOperators {
    public static void main(String[] args) {
        System.out.println("Relational Operators");
        var number01 = 12F;
        var number02 = 22F;

        // Operadores Relacionais: <, >, <=, >=, ==, !=
        var isGreaterThan = number01 > number02;
        var isLessThan = number01 < number02;
        var isEquals = number01 == number02;
        var isDifferent = number01 != number02;

        System.out.println(isGreaterThan);
        System.out.println(isLessThan);
        System.out.println(isEquals);
        System.out.println(isDifferent);
    }
}
