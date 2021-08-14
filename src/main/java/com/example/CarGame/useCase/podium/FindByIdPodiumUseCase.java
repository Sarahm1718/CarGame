package com.example.CarGame.useCase.podium;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.repository.RepositoryPodium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdPodiumUseCase {
    private final RepositoryPodium repositoryPodium;

    @Autowired
    public FindByIdPodiumUseCase(RepositoryPodium repositoryPodium){
        this.repositoryPodium=repositoryPodium;
    }

    public Mono<PodiumDTO> getfindbyid(String id){
        return repositoryPodium.findById(id);
    }
}
