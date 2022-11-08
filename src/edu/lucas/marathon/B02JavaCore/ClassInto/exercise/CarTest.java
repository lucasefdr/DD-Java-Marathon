package edu.lucas.marathon.B02JavaCore.ClassInto.exercise;

public class CarTest {
    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.name = "Pálio";
        carOne.model = "Compact";
        carOne.year = 2003;

        Car carTwo = new Car();
        carTwo.name = "Fusca";
        carTwo.model = "Sport";
        carTwo.year = 1969;

        System.out.println(carOne.name);
        System.out.println(carOne.model);
        System.out.println(carOne.year);

        System.out.println();

        System.out.println(carTwo.name);
        System.out.println(carTwo.model);
        System.out.println(carTwo.year);

        System.out.println();

        // Referenciando outro objeto da mesma classe
        carOne = carTwo;
        System.out.println(carOne.name);
        System.out.println(carTwo.name);
    }
}
