package edu.lucas.marathon.B01Introduction;

public class A18Arrays02 {
    /**
     * Inicialização e iteração de arrays
     */
    public static void main(String[] args) {
        // outra maneira de inicializar arrays
        String[] names1 = new String[]{"Lucas", "Eduardo", "Renata", "Lara"};

        // outra maneira de inicializar arrays
        String[] names2 = {"Lucas", "Eduardo", "Renata", "Lara"};

        // for index
        for (int i = 0; i < names1.length; i++) {
            System.out.println("Name: " + names1[i]);
        }

        // foreach
        for (String name : names2) {
            System.out.println("Name: " + name);
        }
    }
}
