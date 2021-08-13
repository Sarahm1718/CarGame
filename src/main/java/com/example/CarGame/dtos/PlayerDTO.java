package com.example.CarGame.dtos;

import com.example.CarGame.values.Name;
import com.example.CarGame.values.PositionQuantityWinner;
import com.example.CarGame.values.id.DriverId;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.IdCar;
import com.example.CarGame.values.id.PlayerId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Player")
public class PlayerDTO {
    @Id
    private String playerId;

    private String name;
    private Integer positionFirstWinner;
    private Integer positionSecondWinner;
    private Integer positionThirdFirstWinner;
    private GameId gameId;
    private DriverId driverId;

}
