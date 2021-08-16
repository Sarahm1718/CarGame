package com.example.CarGame.values.id;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdLane {

    private final String value;

    public static IdLane of(String value){
        return  new IdLane(value);
    }
    public String getValue(){
        return this.value;
    }
}
