package com.example.CarGame.mapper;

import com.example.CarGame.domain.Podium;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.values.PositionWinner;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.IdPodium;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperPodium {
    public Function<PodiumDTO, Podium> mapperToPodium(String id){
        return updatePodium -> new Podium(
                IdPodium.of(id),
              GameId.of(updatePodium.getGameId()),
              new PositionWinner(updatePodium.getFirstPlace()),
                new PositionWinner(updatePodium.getSecondPlace()),
                new PositionWinner(updatePodium.getThirdPlace())
        );
    }

    public Function<Podium,PodiumDTO> mapperToDTO(){
        return podium -> new PodiumDTO(
                podium.getIdPodium().getValue(),
                podium.getGameId().getValue(),
                podium.getFirstPlace().getValue(),
                podium.getSecondPlace().getValue(),
                podium.getGameId().getValue()
        );
    }
}
