package edu.lucas.marathon.B01Introduction;

public class A06LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Logical Operators");
        // Operadores Lógicos: && (E), || (OU), ! (NOT)
        var age = 24;
        var salary = 2000F;
        var isInTheLaw = age > 30 && salary >= 4612;

        if (isInTheLaw) System.out.println("You are in the law.");
        else System.out.println("You are out the law.");

        var totalCC = 200F;
        var totalCP = 10000F;
        var PS5 = 4799F;
        var canIBuyAPS5 = totalCC > PS5 || totalCP > PS5;

        if (canIBuyAPS5) System.out.println("I can buy a PS5.");
        else System.out.println("I can't buy a PS5.");
    }
}
