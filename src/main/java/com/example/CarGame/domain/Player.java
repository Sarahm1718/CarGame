package com.example.CarGame.domain;

import com.example.CarGame.values.Name;
import com.example.CarGame.values.PositionQuantityWinner;
import com.example.CarGame.values.id.DriverId;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.PlayerId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Player")
public class Player{
    @Id
    private PlayerId playerId;

    private Name name;
    private PositionQuantityWinner positionFirstWinner;
    private PositionQuantityWinner positionSecondWinner;
    private PositionQuantityWinner positionThirdFirstWinner;
    private GameId gameId;
    private DriverId driverId;
}
