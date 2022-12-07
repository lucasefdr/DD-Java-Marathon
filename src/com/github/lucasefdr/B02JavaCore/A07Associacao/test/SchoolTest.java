package com.github.lucasefdr.B02JavaCore.A07Associacao.test;

import com.github.lucasefdr.B02JavaCore.A07Associacao.domain.School;
import com.github.lucasefdr.B02JavaCore.A07Associacao.domain.Teacher;

import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Lucas");
        Teacher teacher2 = new Teacher("Paulo");

        School school1 = new School("Salles Junior");
        school1.setTeachers(List.of(teacher1, teacher2));

        System.out.println(school1);
    }
}
