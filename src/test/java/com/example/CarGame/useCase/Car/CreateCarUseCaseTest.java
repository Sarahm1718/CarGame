package com.example.CarGame.useCase.Car;

import com.example.CarGame.domain.game.Car;
import com.example.CarGame.dtos.CarDTO;
import com.example.CarGame.repository.RepositoryCar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CreateCarUseCaseTest {
    @SpyBean
    CreateCarUseCase useCaseCreateCar;
    @MockBean
    RepositoryCar repositoryCar;

    @Test
    void createCar(){
        var carDTO = new CarDTO("ty",false,1,3,"hgdf","4","43" );
        var car = new Car();
        car.setId("ty");
        car.setGoalArrived(false);
        car.setPositionCurrent(1);
        car.setAdvance(3);
        car.setDriverId("hgdf");
        car.setGameId("4");
        car.setIdLane("43");

        when(repositoryCar.save(Mockito.any(Car.class))).thenReturn(Mono.just(car));

        var response = useCaseCreateCar.CarCreate(carDTO);

        Assertions.assertEquals(response.block(), carDTO);
    }


}