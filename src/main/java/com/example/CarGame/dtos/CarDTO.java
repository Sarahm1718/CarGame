package com.example.CarGame.dtos;

import com.example.CarGame.values.PositionCurrent;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Document(collection = "Car")
public class CarDTO {
    @Id
    private String id;
    private Boolean isArrivedGoal;
    private PositionCurrent positionCurrent;
    private Integer advance;
    private String driverId;
    private String gameId;
    private String idLane;
}
