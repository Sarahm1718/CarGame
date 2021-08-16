package com.example.CarGame.useCase.player;

import com.example.CarGame.dtos.PlayerDTO;
import com.example.CarGame.mapper.MapperPlayer;
import com.example.CarGame.repository.RepositoryPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;
@Service
@Validated
public class FindByIdPlayerUseCase {

    private final RepositoryPlayer repositoryPlayer;
    private final MapperPlayer mapperPlayer;

    @Autowired
    public FindByIdPlayerUseCase( RepositoryPlayer repositoryPlayer, MapperPlayer mapperPlayer) {
        this.repositoryPlayer = repositoryPlayer;
        this.mapperPlayer = mapperPlayer;
    }


    public Mono<PlayerDTO> findById(String id) {
        return repositoryPlayer.findById(id)
                .flatMap(player ->
                        Mono.just(mapperPlayer.mapperToDTO().apply(player)));
    }
}
