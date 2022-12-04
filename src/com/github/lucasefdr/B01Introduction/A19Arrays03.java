package com.github.lucasefdr.B01Introduction;

import java.util.Arrays;

public class A19Arrays03 {
    /**
     * <b>Arrays multidimensionais</b>
     */
    public static void main(String[] args) {
        // 1, 2, 3 meses
        // 31, 28, 31 dias

        int[][] days = new int[1][3];

        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        // for index
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println("Month: " + (j + 1) + " Days: " + days[i][j]);
            }
        }

        // foreach
        for (int[] array : days) {
            for (int num : array) {
                System.out.println(num);
            }
        }

        int[][] arrayInt = new int[2][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[5];

        arrayInt[0][0] = 1;
        arrayInt[0][1] = 2;

        arrayInt[1][0] = 1;
        arrayInt[1][1] = 2;
        arrayInt[1][2] = 3;
        arrayInt[1][3] = 4;

        for (int[] array : arrayInt) {
            System.out.println("Array: " + Arrays.toString(array));
            for (int num : array) {
                System.out.println(num);
            }
        }

        //  outra inicialização de array
        int[][] myArray = {{1, 2, 3}, {1, 2}, {1}};

        for (int[] array : myArray) {
            System.out.print("-> ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }
}
