package edu.lucas.marathon.introduction;

import java.util.Scanner;

public class A11ExIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário:");
        var salary = scanner.nextDouble();
        scanner.close();

        var percent = 0.0;

        if (salary > 0 && salary < 34713) {
            percent = 0.0970;
        } else if (salary >= 34713 && salary < 68508) {
            percent = 0.3735;
        } else if (salary >= 68508) {
            percent = 0.4950;
        } else {
            System.out.println("Entrada inválida!");
        }

        var tax = salary * percent;
        System.out.println(tax);
    }
}
