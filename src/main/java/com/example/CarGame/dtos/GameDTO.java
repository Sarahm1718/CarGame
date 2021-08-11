package com.example.CarGame.dtos;

public class GameDTO {
    private String idGame;
    private String player;
    private Boolean stateGame;
    private String podio;

    public String getIdGame() {
        return idGame;
    }

    public void setIdGame(String idGame) {
        this.idGame = idGame;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Boolean getStateGame() {
        return stateGame;
    }

    public void setStateGame(Boolean stateGame) {
        this.stateGame = stateGame;
    }

    public String getPodio() {
        return podio;
    }

    public void setPodio(String podio) {
        this.podio = podio;
    }
}
