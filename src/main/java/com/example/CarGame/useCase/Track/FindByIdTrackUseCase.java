package com.example.CarGame.useCase.Track;

import com.example.CarGame.dtos.TrackDTO;
import com.example.CarGame.mapper.MapperTrack;
import com.example.CarGame.repository.RepositoryTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdTrackUseCase {
    private final RepositoryTrack repositoryTrack;
    private final MapperTrack mapperTrack;

    @Autowired
    public FindByIdTrackUseCase( RepositoryTrack repositoryTrack, MapperTrack mapperTrackr) {
        this.repositoryTrack = repositoryTrack;
        this.mapperTrack = mapperTrackr;
    }

    public Mono<TrackDTO> getfindbyidtrack(String id){
        return repositoryTrack.findById(id)
                .flatMap(
                        track -> Mono.just(mapperTrack.mapperToTrackDTO().apply(track))
                );
    }
}
