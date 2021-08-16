package com.example.CarGame.values;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class PositionCurrent {
        private final Integer value;

    public PositionCurrent updateCurrentPosition(Integer value){
        return new PositionCurrent(value);
    }

    public PositionCurrent initializeCurrentPosition(){
        return new PositionCurrent(0);
    }
}
