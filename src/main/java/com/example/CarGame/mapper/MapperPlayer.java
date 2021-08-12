package com.example.CarGame.mapper;

import com.example.CarGame.domain.Player;
import com.example.CarGame.dtos.PlayerDTO;
import com.example.CarGame.values.Name;
import com.example.CarGame.values.PlayerId;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperPlayer {
    public Function<PlayerDTO, Player> mapperToPlayer(String id){
        return createPlayer ->{
            Player player = new Player();
            player.getPlayerId(id);
            player.setName(new Name(createPlayer.getName()));
            return player;
        };

    }
}