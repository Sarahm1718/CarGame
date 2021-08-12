package com.example.CarGame.dtos;

public class DriverDTO {
    private String driverId;
    private String throwDice;
    private String playerId;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getThrowDice() {
        return throwDice;
    }

    public void setThrowDice(String throwDice) {
        this.throwDice = throwDice;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
