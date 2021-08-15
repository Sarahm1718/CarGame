package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Player;
import com.example.CarGame.dtos.PlayerDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryPlayer extends ReactiveMongoRepository<Player, String> {

}
