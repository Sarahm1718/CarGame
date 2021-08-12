package com.example.CarGame.values.id;

import java.util.UUID;

public class PlayerId {

    private UUID id;

    public PlayerId(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}
