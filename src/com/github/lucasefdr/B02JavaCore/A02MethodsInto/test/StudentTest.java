package com.github.lucasefdr.B02JavaCore.A02MethodsInto.test;

import com.github.lucasefdr.B02JavaCore.A02MethodsInto.domain.Student;
import com.github.lucasefdr.B02JavaCore.A02MethodsInto.domain.StudentPrinter;

public class StudentTest {
    public static void main(String[] args) {
        StudentPrinter printer = new StudentPrinter();
        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.name = "Eduardo";
        studentOne.age = 49;
        studentOne.gender = 'M';

        studentTwo.name = "Lucas";
        studentTwo.age = 24;
        studentTwo.gender = 'M';

        printer.printStudent(studentOne);
        System.out.println();
        printer.printStudent(studentTwo);

        System.out.println();

        studentOne.print();
        System.out.println();
        studentTwo.print();
    }
}
