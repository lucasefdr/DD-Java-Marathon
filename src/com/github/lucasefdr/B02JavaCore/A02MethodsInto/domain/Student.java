package com.github.lucasefdr.B02JavaCore.A02MethodsInto.domain;

/**
 * Uma <b>classe</b> é um <b>template</b> (uma forma) que irá dar <b>formato</b> aos objetos instanciados a partir dela.
 */
public class Student {
    public String name;
    public int age;
    public char gender;

    public void print() {
        // o this referencia o objeto em si
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}