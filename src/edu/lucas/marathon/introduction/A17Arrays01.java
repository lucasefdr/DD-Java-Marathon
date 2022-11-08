package edu.lucas.marathon.introduction;

import java.util.Arrays;

public class A17Arrays01 {
    /**
     *  <b>Arrays unidimensiosais</b>: arrays são referências para espaços em memória <br>
     *  Variáveis do tipo <b>ref</b> (arrays são considerados objetos na memória)
     */
    public static void main(String[] args) {
        // criando um array com 3 espaços em memória
        int[] ages = new int[3];

        // referência do objeto em memória
        System.out.println(ages);

        // array vazio
        System.out.println(Arrays.toString(ages));

        int age1 = 14;
        int age2 = 53;
        int age3 = 26;

        // populando o array - arrays são indexados
        ages[0] = age1;
        ages[1] = age2;
        ages[2] = age3;

        for (int age : ages) {
            System.out.println("Age: " + age);
        }
    }
}
