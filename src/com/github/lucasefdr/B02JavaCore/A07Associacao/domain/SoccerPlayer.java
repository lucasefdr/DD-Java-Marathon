package com.github.lucasefdr.B02JavaCore.A07Associacao.domain;

public class SoccerPlayer {
    private String name;
    // Jogador pode fazer parte somente de um time - Relacionamento 1 - 1
    private Team team;

    public SoccerPlayer() {
    }

    public SoccerPlayer(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Player name: " + this.name);

        if (team == null) return;

        System.out.println("Team: " + this.team.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
