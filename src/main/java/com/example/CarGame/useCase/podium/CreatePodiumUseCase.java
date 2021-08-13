package com.example.CarGame.useCase.podium;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.mapper.MapperPodium;
import com.example.CarGame.repository.RepositoryPodium;
import com.example.CarGame.values.id.IdPodium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreatePodiumUseCase {

    private final RepositoryPodium repositoryDTOPodium;
    private final MapperPodium mapperPodium;

    @Autowired
    public CreatePodiumUseCase(RepositoryPodium repositoryDTOPodium, MapperPodium mapperPodium){
        this.repositoryDTOPodium = repositoryDTOPodium;
        this.mapperPodium = mapperPodium;
    }
    public Mono<PodiumDTO>  apply(PodiumDTO podiumDTO){
        return repositoryDTOPodium.save(mapperPodium.mapperToPodium(podiumDTO.getIdPodium())
                .apply(podiumDTO))
                .thenReturn(podiumDTO);
    }
}
