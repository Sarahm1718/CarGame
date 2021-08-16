package com.example.CarGame.mapper;

import com.example.CarGame.domain.game.Podium;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.values.PositionWinner;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.IdPodium;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperPodium {
    public Function<PodiumDTO, Podium> mapperToPodium(String id){
        return dataPodium -> {
            Podium podium = new Podium();
            podium.setIdPodium(dataPodium.getIdPodium());
            podium.setGameId(dataPodium.getGameId());
            podium.setFirstPlace(dataPodium.getFirstPlace());
            podium.setSecondPlace(dataPodium.getSecondPlace());
            podium.setThirdPlace(dataPodium.getThirdPlace());
            return podium;

        };
    }

    public Function<Podium,PodiumDTO> mapperToDTO(){
        return podium -> new PodiumDTO(
                podium.getIdPodium(),
                podium.getGameId(),
                podium.getFirstPlace(),
                podium.getSecondPlace(),
                podium.getGameId()
        );
    }
}
