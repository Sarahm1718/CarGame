package com.example.CarGame.useCase.Track;

import com.example.CarGame.domain.game.Track;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.dtos.TrackDTO;
import com.example.CarGame.mapper.MapperTrack;
import com.example.CarGame.repository.RepositoryTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreateTrackUseCase  {


    private final RepositoryTrack repositoryTrack;
    private final MapperTrack mapperTrack;

    @Autowired
    public CreateTrackUseCase(RepositoryTrack repositoryTrack, MapperTrack mapperTrack) {
        this.repositoryTrack = repositoryTrack;
        this.mapperTrack = mapperTrack;
    }

    public Mono<TrackDTO> apply(TrackDTO trackDTO){
        return repositoryTrack
                .save(mapperTrack.mapperToTrack(trackDTO.getIdPodium())
                        .apply(trackDTO))
                .map(mapperTrack.mapperToTrackDTO());
    }
}
