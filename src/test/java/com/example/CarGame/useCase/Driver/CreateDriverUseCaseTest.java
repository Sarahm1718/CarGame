package com.example.CarGame.useCase.Driver;

import com.example.CarGame.domain.game.Driver;
import com.example.CarGame.dtos.DriverDTO;
import com.example.CarGame.repository.RepositoryDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class CreateDriverUseCaseTest {

    @SpyBean
    CreateDriverUseCase createDriverUseCase;

    @MockBean
    RepositoryDriver repositoryDriver;

    @Test
    void createDriver(){
        var driverDTO = new DriverDTO("12",1,"34","hola","po");
        var driver = new Driver();
        driver.setDriverId("12");
        driver.setPosition(1);
        driver.setPlayerId("34");
        driver.setIdLane("hola");
        driver.setIdCar("po");


        when(repositoryDriver.save(Mockito.any(Driver.class))).thenReturn(Mono.just(driver));

        var response = createDriverUseCase.apply(driverDTO);

        Assertions.assertEquals(response.block(), driverDTO);
    }

}