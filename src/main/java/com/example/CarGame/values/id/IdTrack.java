package com.example.CarGame.values.id;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdTrack {
    private final String value;

    public static IdTrack of(String value){
        return  new IdTrack(value);
    }
    public String getValue(){
        return this.value;
    }
}
