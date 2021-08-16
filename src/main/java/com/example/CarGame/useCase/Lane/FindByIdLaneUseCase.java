package com.example.CarGame.useCase.Lane;

import com.example.CarGame.dtos.LaneDTO;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.mapper.MapperLane;
import com.example.CarGame.repository.RepositoryLane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdLaneUseCase {

    private final RepositoryLane repositoryLane;
    private final MapperLane mapperLane;

    @Autowired
    public FindByIdLaneUseCase(RepositoryLane repositoryLane, MapperLane mapperLane) {
        this.repositoryLane = repositoryLane;
        this.mapperLane = mapperLane;
    }

    public Mono<LaneDTO> findbyidLane(String id){
        return repositoryLane.findById(id)
                .flatMap(lane -> Mono.just(mapperLane.mapperToLaneDTO().apply(lane)));
    }
}
