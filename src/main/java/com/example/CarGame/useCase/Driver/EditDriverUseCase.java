package com.example.CarGame.useCase.Driver;

import com.example.CarGame.dtos.DriverDTO;
import com.example.CarGame.mapper.MapperDriver;
import com.example.CarGame.repository.RepositoryDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class EditDriverUseCase {


    private final RepositoryDriver repositoryDriver;
    private final MapperDriver mapperDriver;

    @Autowired
    public EditDriverUseCase(RepositoryDriver repositoryDriver, MapperDriver mapperDriver) {
        this.repositoryDriver = repositoryDriver;
        this.mapperDriver = mapperDriver;
    }

    public void actualyDriver(DriverDTO driverDTO){
         repositoryDriver.save(mapperDriver.mapperToDriver(driverDTO.getDriverId())
                        .apply(driverDTO))
                 .subscribe();
    }
}
