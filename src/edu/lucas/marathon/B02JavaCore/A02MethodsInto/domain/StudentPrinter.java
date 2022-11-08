package edu.lucas.marathon.B02JavaCore.A02MethodsInto.domain;

public class StudentPrinter {
    public void printStudent(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Gender: " + student.gender);
    }
}
