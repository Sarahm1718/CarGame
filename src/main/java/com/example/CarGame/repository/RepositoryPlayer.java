package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Player;
import com.example.CarGame.dtos.PlayerDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface RepositoryPlayer extends ReactiveMongoRepository<Player, String> {
    Flux<Player> findByGameId(String gameId);

}
