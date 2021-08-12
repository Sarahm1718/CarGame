package com.example.CarGame.domain;

import com.example.CarGame.values.Name;
import com.example.CarGame.values.PlayerId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Player {
    @Id
    private PlayerId playerId;
    private Name name;

    public PlayerId getPlayerId(String id) {
        return playerId;
    }

    public void setPlayerId(PlayerId playerId) {
        this.playerId = playerId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
