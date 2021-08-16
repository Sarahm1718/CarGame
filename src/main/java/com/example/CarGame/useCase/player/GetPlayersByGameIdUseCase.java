package com.example.CarGame.useCase.player;


import com.example.CarGame.dtos.PlayerDTO;
import com.example.CarGame.mapper.MapperPlayer;
import com.example.CarGame.repository.RepositoryPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class GetPlayersByGameIdUseCase {

    private final RepositoryPlayer repositoryPlayer;
    private final MapperPlayer mapperPlayer;

    @Autowired
    public GetPlayersByGameIdUseCase(RepositoryPlayer repositoryPlayer, MapperPlayer mapperPlayer) {
        this.repositoryPlayer = repositoryPlayer;
        this.mapperPlayer = mapperPlayer;
    }

    public Flux<PlayerDTO> getPlayersByGameId(String id){
        return repositoryPlayer.findByGameId(id)
                .flatMap(
                        player -> Flux.just(mapperPlayer.mapperToDTO().apply(player))
                );
    }
}
