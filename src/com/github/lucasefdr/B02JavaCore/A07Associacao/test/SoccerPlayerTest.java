package com.github.lucasefdr.B02JavaCore.A07Associacao.test;

import com.github.lucasefdr.B02JavaCore.A07Associacao.domain.SoccerPlayer;
import com.github.lucasefdr.B02JavaCore.A07Associacao.domain.Team;

import java.util.ArrayList;
import java.util.List;

public class SoccerPlayerTest {
    public static void main(String[] args) {
        // instânciado objetos da classe SoccerPlayer
        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Pelé");
        SoccerPlayer soccerPlayer2 = new SoccerPlayer("Romário");
        SoccerPlayer soccerPlayer3 = new SoccerPlayer("Ronaldo");

        Team team = new Team("Seleção Brasileira");

        soccerPlayer1.setTeam(team);
        soccerPlayer2.setTeam(team);
        soccerPlayer3.setTeam(team);

        // lista de SoccerPlayers
        List<SoccerPlayer> soccerPlayers = List.of(soccerPlayer1, soccerPlayer2, soccerPlayer3);
        soccerPlayers.forEach(System.out::println);
    }
}
