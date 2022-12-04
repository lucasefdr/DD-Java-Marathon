package com.github.lucasefdr.B01Introduction;

public class A02PrimitiveTypes {

    public static void main(String[] args) {
        // Tipos primitivos: int, double, float, char, byte, short, long, boolean
        byte ageByte = 127; // 8 bits: -128 até 127
        int integer = 129; // 16 bits: -32768 até 32767
        short ageShort = 32767; // 32 bits: -2^31 até 2^31 - 1
        long bigNumber = 312321441122L; // 64 bits: -2^63 até 2^63 - 1
        double salaryDouble = 12000;
        float salaryFloat = 12000F;
        boolean isTrueOrFalse = true; // true or false
        char character = 'X'; // ASCII values
        char characterUni = '\u31f2';

        System.out.println(characterUni);

        // Cast explícito
        int explInt = (int) 10000000000L; // Irá cortar os bits
        System.out.println(explInt);

        // String
        String frase = "Never forget it";
        System.out.println(frase);
    }
}
