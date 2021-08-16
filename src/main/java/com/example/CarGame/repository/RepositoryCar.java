package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public interface RepositoryCar extends ReactiveMongoRepository<Car, String> {
    Flux<Car> findByDriverId(String driverId);
}
