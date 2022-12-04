package com.github.lucasefdr.B01Introduction;

public class A04ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators");
        // Operadores Aritméticos: +, -, *, /, %
        var number01 = 12F;
        var number02 = 22F;

        var sum = number02 + number01;
        var subtraction = number02 - number01;
        var multiplication = number02 * number01;
        var division = number02 / number01;
        var rest = number02 % number01;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(rest);
    }
}
