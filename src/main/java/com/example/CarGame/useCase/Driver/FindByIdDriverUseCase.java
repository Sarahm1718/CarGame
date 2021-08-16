package com.example.CarGame.useCase.Driver;

import com.example.CarGame.dtos.DriverDTO;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.mapper.MapperDriver;
import com.example.CarGame.repository.RepositoryDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class FindByIdDriverUseCase {

    private final RepositoryDriver repositoryDriver;
    private final MapperDriver mapperDriver;

    @Autowired
    public FindByIdDriverUseCase(RepositoryDriver repositoryDriver, MapperDriver mapperDriver) {
        this.repositoryDriver = repositoryDriver;
        this.mapperDriver = mapperDriver;
    }

    public Mono<DriverDTO> findbyiddriver(String id){
        return repositoryDriver.findById(id)
                .flatMap(driver -> Mono.just(mapperDriver.mapperToDriverDTO().apply(driver)));
    }
}
