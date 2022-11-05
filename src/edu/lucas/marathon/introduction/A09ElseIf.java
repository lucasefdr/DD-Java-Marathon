package edu.lucas.marathon.introduction;

import java.util.Scanner;

public class A09ElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        var age = scanner.nextInt();
        scanner.close();

        // Estrutura condicional com elseif
        var isInfantil = age > 0 && age < 15;
        var isJuvenil = age >= 15 && age < 18;
        var isAdulto = age >= 18;

        if (isInfantil) {
            System.out.println("Categoria infantil.");
        } else if (isJuvenil) {
            System.out.println("Categoria juvenil.");
        } else if (isAdulto) {
            System.out.println("Categoria adulta.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
