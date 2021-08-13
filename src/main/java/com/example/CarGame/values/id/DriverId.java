package com.example.CarGame.values.id;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class DriverId {
    private final String value;

    public static DriverId of(String value){
        return  new DriverId(value);
    }
    public String getValue(){
        return this.value;
    }
}
