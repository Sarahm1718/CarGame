package com.example.CarGame.mapper;

import com.example.CarGame.domain.game.Player;
import com.example.CarGame.dtos.PlayerDTO;
import com.example.CarGame.values.Name;
import com.example.CarGame.values.PositionQuantityWinner;
import com.example.CarGame.values.id.DriverId;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.PlayerId;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component

public class MapperPlayer {

    public Function<PlayerDTO, Player> mapperToPlayer(String id){
        return updatePlayer -> {
            Player player = new Player();
            player.setPlayerId(id);
            player.setName(updatePlayer.getName());
            player.setPositionFirstWinner(updatePlayer.getPositionFirstWinner());
            player.setPositionSecondWinner(updatePlayer.getPositionSecondWinner());
            player.setPositionThirdFirstWinner(updatePlayer.getPositionThirdFirstWinner());
            player.setGameId(updatePlayer.getGameId());
            player.setDriverId(updatePlayer.getDriverId());
            return player;

        };


    }
    public Function<Player, PlayerDTO> mapperToDTO(){
        return player -> new PlayerDTO(
                player.getPlayerId(),
                player.getName(),
                player.getPositionFirstWinner(),
                player.getPositionSecondWinner(),
                player.getPositionThirdFirstWinner(),
                player.getGameId(),
                player.getDriverId()
        );
    }
}