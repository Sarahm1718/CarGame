package com.example.CarGame.domain;

import com.example.CarGame.values.IdGame;
import com.example.CarGame.values.StateGame;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Game {
    @Id
    private IdGame idGame;
    private Player player;
    private StateGame stateGame;
    private Podium podium;

    public IdGame getIdGame() {
        return idGame;
    }

    public void setIdGame(IdGame idGame) {
        this.idGame = idGame;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public StateGame getStateGame() {
        return stateGame;
    }

    public void setStateGame(StateGame stateGame) {
        this.stateGame = stateGame;
    }

    public Podium getPodio() {
        return podium;
    }

    public void setPodio(Podium podium) {
        this.podium = podium;
    }
}
