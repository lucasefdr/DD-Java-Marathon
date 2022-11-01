package edu.lucas.marathon.introduction;

import java.util.Scanner;

public class A13Ex03SwitchCase {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número relativo ao dia da semana:");
        var day = scanner.nextByte();
        scanner.close();

        String answer = switch (day) {
            case 2, 3, 4, 5, 6 -> "Dia útil";
            case 1, 7 -> "Fim de semana";
            default -> "Entrada inválida";
        };

        System.out.println(answer);

        switch (day) {
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            case 1, 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Entrada inválida");
        }
    }
}
