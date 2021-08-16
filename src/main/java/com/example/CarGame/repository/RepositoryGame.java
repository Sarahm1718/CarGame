package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Game;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGame extends ReactiveMongoRepository<Game, String> {
}
