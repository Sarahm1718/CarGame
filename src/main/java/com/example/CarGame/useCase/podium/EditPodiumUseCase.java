package com.example.CarGame.useCase.podium;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.repository.RepositoryPodium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated

public class EditPodiumUseCase {

    private final RepositoryPodium repositoryPodium;

    @Autowired
    public EditPodiumUseCase(RepositoryPodium repositoryPodium) {
        this.repositoryPodium = repositoryPodium;

    }

    public Mono<PodiumDTO> apply(PodiumDTO podiumDTO) {
        return repositoryPodium.save(podiumDTO)
                .thenReturn(podiumDTO);
    }
}
