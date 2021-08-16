package com.example.CarGame.useCase.Car;

import com.example.CarGame.dtos.CarDTO;
import com.example.CarGame.dtos.GameDTO;
import com.example.CarGame.mapper.MapperCar;
import com.example.CarGame.repository.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated

public class CreateCarUseCase {
    private final RepositoryCar repositoryCar;
    private final MapperCar mapperCar;

    @Autowired
    public CreateCarUseCase(RepositoryCar repositoryCar, MapperCar mapperCar) {
        this.repositoryCar = repositoryCar;
        this.mapperCar = mapperCar;
    }

    public Mono<CarDTO> CarCreate(CarDTO carDTO){
        return repositoryCar.save(mapperCar.mapperToCar(carDTO.getId())
                .apply(carDTO))
                .map(mapperCar.mappertoCarDTO());
    }


}
