package edu.lucas.marathon.introduction;

import java.util.Scanner;

public class A12SwitchCase {
    public static void main(String[] args) {
        // switch case
        // imprima o dia da semana, considerando 1 como Domingo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número relativo ao dia da semana:");
        byte day = scanner.nextByte();
        scanner.close();

        // tipos de variáveis que o switch aceita: char, int, byte, short, enum, String
        switch (day) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Entrada inválida");
        }

        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Entrada inválida");
        }
    }
}