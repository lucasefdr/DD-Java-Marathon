package edu.lucas.marathon.introduction;

import java.util.Scanner;

public class A08IF {
    public static void main(String[] args) {
        // Estrutura básica
        if (true) {
            System.out.println("Dentro do IF.");

        } else {
            System.out.println("Dentro do ELSE.");
        }

        System.out.println("Fora da estrutura condicional.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        var age = scanner.nextInt();
        scanner.close();

        var isAuthorized = age >= 18;

        if (isAuthorized) {
            System.out.println("Pode comprar bebida alcólica.");
        } else {
            System.out.println("Não pode comprar bebida alcólica.");
        }
    }
}
