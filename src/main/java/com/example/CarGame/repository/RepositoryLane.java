package com.example.CarGame.repository;

import com.example.CarGame.domain.Lane;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLane  extends ReactiveMongoRepository<Lane, String> {
}
