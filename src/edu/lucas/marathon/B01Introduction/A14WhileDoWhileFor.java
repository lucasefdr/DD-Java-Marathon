package edu.lucas.marathon.B01Introduction;

public class A14WhileDoWhileFor {
    public static void main(String[] args) {
        // while: enquanto...
        var count = 0;

        while (count < 10) {
            System.out.println(++count);
        }

        // do while: faça x enquanto...
        count = 0;
        do {
            System.out.println("Dentro do 'do while': " + ++count);
        } while (count < 10);

        // for: para...
        for (int i = 1; i < 101; i++) {
            System.out.println("Contando: " + i);
        }
    }
}
