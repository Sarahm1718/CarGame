package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryCar extends ReactiveMongoRepository<Car, String> {
}
