package com.github.lucasefdr.B02JavaCore.A07Associacao.domain;

import java.util.List;

public class Team {
    private String name;
    private List<SoccerPlayer> soccerPlayers;

    public Team(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Team name: " + this.name);

        if (soccerPlayers == null) return;

        for (SoccerPlayer soccerPlayer : soccerPlayers) {
            System.out.println(soccerPlayer.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SoccerPlayer> getSoccerPlayers() {
        return soccerPlayers;
    }

    public void setSoccerPlayers(List<SoccerPlayer> soccerPlayers) {
        this.soccerPlayers = soccerPlayers;
    }
}
