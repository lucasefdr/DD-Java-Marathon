package com.github.lucasefdr.B02JavaCore.A02MethodsInto.domain;

/**
 * Essa classe tem uma função que irá receber os parâmetros por referência.
 */
public class StudentPrinter {
    /**
     * Como o parâmetro é passado por referência, podemos alterar o objeto dentro do nosso método
     */
    public void printStudent(Student student) {
        // student.name = "Name change by printStudent";

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Gender: " + student.gender);
    }
}
