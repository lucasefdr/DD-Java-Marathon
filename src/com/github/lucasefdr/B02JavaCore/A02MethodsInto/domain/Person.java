package com.github.lucasefdr.B02JavaCore.A02MethodsInto.domain;

public class Person {
    // attributes
    private String name;
    private Integer age;

    // methods
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0) throw new RuntimeException("Age cannot be less than 1");
        this.age = age;
    }
}
