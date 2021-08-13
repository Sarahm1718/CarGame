package com.example.CarGame.domain;

import com.example.CarGame.values.StateGame;
import com.example.CarGame.values.id.GameId;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Game")
public class Game {
    @Id
    private GameId gameId;
    private Player player;
    private StateGame stateGame;
    private Podium podium;


}
