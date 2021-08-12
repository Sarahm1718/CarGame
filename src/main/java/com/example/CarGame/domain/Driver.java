package com.example.CarGame.domain;

import com.example.CarGame.values.id.DriverId;
import com.example.CarGame.values.id.PlayerId;
import com.example.CarGame.values.ThrowDice;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Driver {
    @Id
    private DriverId driverId;
    private ThrowDice throwDice;
    private PlayerId playerId;

    public DriverId getDriverId() {
        return driverId;
    }

    public void setDriverId(DriverId driverId) {
        this.driverId = driverId;
    }

    public ThrowDice getThrowDice() {
        return throwDice;
    }

    public void setThrowDice(ThrowDice throwDice) {
        this.throwDice = throwDice;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public void setPlayerId(PlayerId playerId) {
        this.playerId = playerId;
    }
}
