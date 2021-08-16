package com.example.CarGame.useCase.Driver;

import com.example.CarGame.dtos.DriverDTO;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.mapper.MapperDriver;
import com.example.CarGame.mapper.MapperPodium;
import com.example.CarGame.repository.RepositoryDriver;
import com.example.CarGame.repository.RepositoryPodium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class CreateDriverUseCase {

    private final RepositoryDriver repositoryDriver;
    private final MapperDriver mapperDriver;

    @Autowired

    public CreateDriverUseCase(RepositoryDriver repositoryDriver, MapperDriver mapperDriver) {
        this.repositoryDriver = repositoryDriver;
        this.mapperDriver = mapperDriver;
    }

    public Mono<DriverDTO> apply(DriverDTO driverDTO){
        return repositoryDriver
                .save(mapperDriver.mapperToDriver(driverDTO.getDriverId())
                        .apply(driverDTO))
                .map(mapperDriver.mapperToDriverDTO());
    }
}
