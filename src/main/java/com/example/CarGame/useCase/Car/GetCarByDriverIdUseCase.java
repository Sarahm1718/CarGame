package com.example.CarGame.useCase.Car;

import com.example.CarGame.dtos.CarDTO;
import com.example.CarGame.mapper.MapperCar;
import com.example.CarGame.repository.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class GetCarByDriverIdUseCase {

    private final RepositoryCar repositoryCar;
    private final MapperCar mapperCar;

    @Autowired
    public GetCarByDriverIdUseCase(RepositoryCar repositoryCar, MapperCar mapperCar) {
        this.repositoryCar = repositoryCar;
        this.mapperCar = mapperCar;
    }

    public Flux<CarDTO> findCarsByDriverId(String id){
        return repositoryCar.findByDriverId(id)
                .flatMap(
                        car -> Flux.just(mapperCar.mappertoCarDTO().apply(car))
                );
    }
}
