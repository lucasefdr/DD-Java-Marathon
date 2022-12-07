package com.github.lucasefdr.B02JavaCore.A07Associacao.domain;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    // uma School pode ter vários Teachers - Relacionamento N - 1
    List<Teacher> teachers = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        if (this.teachers == null) return "School name: " + this.name;
        return "School name: " + this.name + ", Teachers: " + this.teachers;
    }
}
