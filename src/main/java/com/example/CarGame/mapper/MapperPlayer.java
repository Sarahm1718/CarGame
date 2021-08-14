package com.example.CarGame.mapper;

import com.example.CarGame.domain.Player;
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
        return updatePlayer -> new Player(
              PlayerId.of(id),
                new Name(updatePlayer.getName()),
                new PositionQuantityWinner(updatePlayer.getPositionFirstWinner()),
                new PositionQuantityWinner(updatePlayer.getPositionSecondWinner()),
                new PositionQuantityWinner(updatePlayer.getPositionThirdFirstWinner()),
                GameId.of(updatePlayer.getGameId()),
                DriverId.of(updatePlayer.getDriverId())
        );
    }
    public Function<Player, PlayerDTO> mapperToDTO(){
        return player -> new PlayerDTO(
                player.getPlayerId().getValue(),
                player.getName().getName(),
                player.getPositionFirstWinner().getValue(),
                player.getPositionSecondWinner().getValue(),
                player.getPositionThirdFirstWinner().getValue(),
                player.getGameId().getValue(),
                player.getDriverId().getValue()
        );
    }
}