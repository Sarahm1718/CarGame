package com.example.CarGame.domain.game;

import com.example.CarGame.values.*;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.IdPodium;
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
@Document(collection = "Podium")
public class Podium {
    @Id
    private IdPodium idPodium;
    private GameId gameId;
    private PositionWinner firstPlace;
    private PositionWinner secondPlace;
    private PositionWinner thirdPlace;

}