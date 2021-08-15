/*package com.example.CarGame.useCase.podium;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.repository.RepositoryPodium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class FindByGameIdPodium {
    private final RepositoryPodium repositoryPodium;

@Autowired
    public FindByGameIdPodium(RepositoryPodium repositoryPodium) {
        this.repositoryPodium = repositoryPodium;
    }

    public Flux<PodiumDTO>getPodiumByGameId(String id){
    return repositoryPodium.findAll(id);
    }
}*/
