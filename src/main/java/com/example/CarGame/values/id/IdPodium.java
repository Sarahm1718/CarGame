package com.example.CarGame.values.id;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class IdPodium {
    private final String value;

    public static IdPodium of(String value){
        return  new IdPodium(value);
    }
    public String getValue(){
        return this.value;
    }
}
