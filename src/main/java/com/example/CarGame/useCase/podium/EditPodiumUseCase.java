package com.example.CarGame.useCase.podium;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.mapper.MapperPodium;
import com.example.CarGame.repository.RepositoryPodium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated

public class EditPodiumUseCase {

    private final RepositoryPodium repositoryPodium;
    private final MapperPodium mapperPodium;

    @Autowired
    public EditPodiumUseCase(RepositoryPodium repositoryPodium, MapperPodium mapperPodium) {
        this.repositoryPodium = repositoryPodium;

        this.mapperPodium = mapperPodium;
    }

    public Mono<PodiumDTO> apply(PodiumDTO podiumDTO) {
        return repositoryPodium.save(mapperPodium.mapperToPodium(podiumDTO.getIdPodium())
        .apply(podiumDTO))
                .map(mapperPodium.mapperToDTO());
    }
}
