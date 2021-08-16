package com.example.CarGame.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Driver")
public class DriverDTO {
    @Id
    private  String driverId;
    private  Integer position;
    private  String playerId;
    private  String idLane;
    private  String idCar;

}
