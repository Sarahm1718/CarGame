package com.example.CarGame.values.id;

import java.util.UUID;

public class DriverId {
    private UUID id;

    public DriverId(UUID id) {
        this.id = id;
    }

    public String getId() {
        return id.toString();
    }
}
