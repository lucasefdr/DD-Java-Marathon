package com.github.lucasefdr.B02JavaCore.A07Associacao.domain;

public class Team {
    private String name;


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
