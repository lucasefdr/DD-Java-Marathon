package com.github.lucasefdr.B02JavaCore.A06StaticModifier.domain;

public class Car {
    private String name;
    private Double maxSpeed;
    private static Double limitSpeed = 250.0;

    public Car(String name, Double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static Double getLimitSpeed() {
        return limitSpeed;
    }

    public static void setLimitSpeed(Double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", maxSpeed=" + maxSpeed + ", limitSpeed=" + limitSpeed + '}';
    }
}