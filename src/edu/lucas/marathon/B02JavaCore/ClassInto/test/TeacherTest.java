package edu.lucas.marathon.B02JavaCore.ClassInto.test;

import edu.lucas.marathon.B02JavaCore.ClassInto.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacherOne = new Teacher();
        teacherOne.name = "Maria";
        teacherOne.age = 34;
        teacherOne.gender = 'F';

        System.out.println(teacherOne.name);
        System.out.println(teacherOne.age);
        System.out.println(teacherOne.gender);
    }

}
