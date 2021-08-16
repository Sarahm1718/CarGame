package com.example.CarGame.values;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class GoalArrived {



    private final Boolean value;

    public static GoalArrived trueValue(){
        return new GoalArrived(Boolean.TRUE);
    }

}
