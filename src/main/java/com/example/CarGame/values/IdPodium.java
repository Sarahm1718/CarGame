package com.example.CarGame.values;

import java.util.UUID;

public class IdPodium {
    private UUID id;

    public IdPodium(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}
