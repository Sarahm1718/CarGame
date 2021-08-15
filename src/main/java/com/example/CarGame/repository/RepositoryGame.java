package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Game;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryGame extends ReactiveMongoRepository<Game, String> {
}
