package com.example.CarGame.dtos;

import com.example.CarGame.values.id.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Document(collection = "Lane")
public class LaneDTO {
    private String idLane;
    private String idCar;
    private String gameId;
    private String idTrack;
    private String driverId;
}
