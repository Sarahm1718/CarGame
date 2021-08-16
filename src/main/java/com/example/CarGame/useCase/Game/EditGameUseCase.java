package com.example.CarGame.useCase.Game;

import com.example.CarGame.dtos.CarDTO;
import com.example.CarGame.mapper.MapperCar;
import com.example.CarGame.repository.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class EditGameUseCase {

    private final RepositoryCar repositoryCar;
    private final MapperCar mapperCar;

    @Autowired
    public EditGameUseCase(RepositoryCar repositoryCar, MapperCar mapperCar) {
        this.repositoryCar = repositoryCar;
        this.mapperCar = mapperCar;
    }

    public void editGame(CarDTO carDTO){
         repositoryCar.save(mapperCar.mapperToCar(carDTO.getId())
                        .apply(carDTO))
                 .subscribe();
    }
}
