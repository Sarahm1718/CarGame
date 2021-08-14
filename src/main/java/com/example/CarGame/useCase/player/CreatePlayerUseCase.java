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

    private final RepositoryPlayer repositoryDTOPlayer;


    public CreatePlayerUseCase(RepositoryPlayer repositoryPlayer) {
        this.repositoryDTOPlayer = repositoryPlayer;
    }

    public Mono<PlayerDTO> apply(PlayerDTO playerDTO){
        return  repositoryDTOPlayer
                .save(playerDTO)
                .thenReturn(playerDTO);
    }
}
