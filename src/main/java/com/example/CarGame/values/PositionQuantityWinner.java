package com.example.CarGame.values;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PositionQuantityWinner {
    private final Integer value;
    public  PositionQuantityWinner incrementValue(Integer value) {
        return new PositionQuantityWinner(value);
    }
}
