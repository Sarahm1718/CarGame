package com.example.CarGame.domain;

import com.example.CarGame.values.id.*;
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
@Document(collection = "Lane")
public class Lane {
    @Id
    private IdLane idLane;
    private IdCar idCar;
    private GameId gameId;
    private IdTrack idTrack;
    private DriverId driverId;

}