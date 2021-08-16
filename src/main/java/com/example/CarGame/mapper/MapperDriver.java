package com.example.CarGame.mapper;

import com.example.CarGame.domain.game.Driver;
import com.example.CarGame.dtos.DriverDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperDriver {
    public Function<DriverDTO, Driver> mapperToDriver(String id){
        return updateDriver -> {
            Driver driver = new Driver();
            driver.setDriverId(id);
            driver.setPosition(updateDriver.getPosition());
            driver.setPlayerId(updateDriver.getPlayerId());
            driver.setIdLane(updateDriver.getIdLane());
            driver.setIdCar(updateDriver.getIdCar());
            return driver;
        };
    }

    public Function<Driver,DriverDTO> mapperToDriverDTO(){
        return driver -> new DriverDTO(
                driver.getDriverId(),
                driver.getPosition(),
                driver.getPlayerId(),
                driver.getIdLane(),
                driver.getIdCar()
        );
    }
}
