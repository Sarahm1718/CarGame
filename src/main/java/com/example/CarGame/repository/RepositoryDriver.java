package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Driver;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDriver extends ReactiveMongoRepository<Driver,String> {

}
