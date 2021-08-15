package com.example.CarGame.useCase.player;

import com.example.CarGame.dtos.PlayerDTO;
import com.example.CarGame.mapper.MapperPlayer;
import com.example.CarGame.repository.RepositoryPlayer;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreatePlayerUseCase {

    private final RepositoryPlayer repositoryPlayer;
    private final MapperPlayer mapperPlayer;


    public CreatePlayerUseCase(RepositoryPlayer repositoryPlayer, MapperPlayer mapperPlayer) {
        this.repositoryPlayer = repositoryPlayer;
        this.mapperPlayer = mapperPlayer;
    }

    public Mono<PlayerDTO> apply(PlayerDTO playerDTO){
        return  repositoryPlayer
                .save(mapperPlayer.mapperToPlayer(playerDTO.getPlayerId())
                .apply(playerDTO))
                .map(mapperPlayer.mapperToDTO());
    }
}
