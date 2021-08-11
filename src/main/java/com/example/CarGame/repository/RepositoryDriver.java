package com.example.CarGame.repository;

import com.example.CarGame.domain.Driver;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryDriver extends ReactiveMongoRepository<Driver,String> {

}
