package com.github.lucasefdr.B02JavaCore.A06StaticModifier.test;

import com.github.lucasefdr.B02JavaCore.A06StaticModifier.domain.Car;

import java.util.Arrays;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 280D);
        Car c2 = new Car("Mercedes", 275D);
        Car c3 = new Car("Audi", 190D);

        // Alterando um atributo da classe (static)
        Car.limitSpeed = 300D;

        List<Car> carList = Arrays.asList(c1, c2, c3);
        carList.forEach(System.out::println);
    }
}
