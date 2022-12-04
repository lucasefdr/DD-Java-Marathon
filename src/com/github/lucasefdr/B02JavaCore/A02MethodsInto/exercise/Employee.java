package com.github.lucasefdr.B02JavaCore.A02MethodsInto.exercise;

import java.util.Arrays;

public class Employee {
    // atributos
    public String name;
    public Integer age;
    public Double[] salaries;

    // métodos
    public String printData() {
        if (salaries != null) {
            return "Name: " + this.name + "\nAge: " + this.age + "\nSalaries: " + Arrays.toString(this.salaries);
        }
        return "Name: " + this.name + "\nAge: " + this.age;
    }

    public Double salaryAverage() {
        if (this.salaries == null) return 0.0;
        double average = 0;
        for (double salary : this.salaries) {
            average += salary;
        }
        average /= this.salaries.length;

        return average;
    }
}
