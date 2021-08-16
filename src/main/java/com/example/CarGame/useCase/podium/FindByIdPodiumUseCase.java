package com.example.CarGame.useCase.podium;

import com.example.CarGame.domain.game.Podium;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.mapper.MapperPodium;
import com.example.CarGame.repository.RepositoryPodium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdPodiumUseCase {
    private final RepositoryPodium repositoryPodium;
    private final MapperPodium mapperPodium;

    @Autowired
    public FindByIdPodiumUseCase(RepositoryPodium repositoryPodium, MapperPodium mapperPodium){
        this.repositoryPodium=repositoryPodium;
        this.mapperPodium = mapperPodium;
    }

    public Mono<PodiumDTO> getfindbyid(String id){
        return repositoryPodium.findById(id)
                .flatMap(podium -> Mono.just(mapperPodium.mapperToDTO().apply(podium)));
    }
}