package edu.lucas.marathon.B02JavaCore.A01ClassInto.test;

import edu.lucas.marathon.B02JavaCore.A01ClassInto.domain.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student studentOne;
        studentOne = new Student();
        studentOne.name = "Eduardo";
        studentOne.age = 49;
        studentOne.gender = 'M';

        // instanciando um objeto a partir da classe pessoa (variável de referência)
        Student studentTwo = new Student();
        studentTwo.name = "Lucas";
        studentTwo.age = 24;
        studentTwo.gender = 'M';

        System.out.println(studentTwo.name);
        System.out.println(studentTwo.age);
        System.out.println(studentTwo.gender);
    }
}
