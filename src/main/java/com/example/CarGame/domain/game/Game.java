package com.example.CarGame.domain.game;

import com.example.CarGame.values.StateGame;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.IdTrack;
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
@Document(collection = "Game")
public class Game {
    @Id
    private String gameId;
    private String idTrack;


}