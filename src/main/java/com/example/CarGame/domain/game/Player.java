package com.example.CarGame.domain.game;

import com.example.CarGame.values.Name;
import com.example.CarGame.values.PositionQuantityWinner;
import com.example.CarGame.values.id.DriverId;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.PlayerId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Player")
public class Player{
    @Id
    private String playerId;
    private String name;
    private Integer positionFirstWinner;
    private Integer positionSecondWinner;
    private Integer positionThirdFirstWinner;
    private String gameId;
    private String driverId;
}
