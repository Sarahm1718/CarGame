package com.example.CarGame.mapper;

import com.example.CarGame.domain.game.Car;
import com.example.CarGame.dtos.CarDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperCar {
    public Function<CarDTO, Car> mapperToCar(String id) {
        return updateCar -> {
            Car car = new Car();
            car.setId(updateCar.getId());
            car.setIsArrivedGoal(updateCar.getIsArrivedGoal());
            car.setPositionCurrent(updateCar.getPositionCurrent());
            car.setAdvance(updateCar.getAdvance());
            car.setDriverId(updateCar.getDriverId());
            car.setGameId(updateCar.getGameId());
            car.setIdLane(updateCar.getIdLane());
            return car;
        };

    }

    public Function<Car, CarDTO> mappertoCarDTO(){
        return car -> new CarDTO(
                car.getId(),
                car.getIsArrivedGoal(),
                car.getPositionCurrent(),
                car.getAdvance(),
                car.getDriverId(),
                car.getGameId(),
                car.getIdLane()
        );
    }
}
