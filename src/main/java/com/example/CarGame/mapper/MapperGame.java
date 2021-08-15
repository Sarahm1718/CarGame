package com.example.CarGame.mapper;

import com.example.CarGame.domain.game.Game;
import com.example.CarGame.dtos.GameDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperGame {
    public Function<GameDTO, Game> mapperToGame(String id){
        return updateGame -> {
            Game game = new Game();
            game.setGameId(id);
            game.setIdTrack(updateGame.getIdTrack());
            return game;
        };
    }

    public Function<Game,GameDTO> mapperToGameDTO(){
        return game -> new GameDTO(
                game.getGameId(),
                game.getIdTrack()
        );
    }
}
