package com.example.CarGame.repository;

import com.example.CarGame.domain.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RepositoryPlayer extends ReactiveMongoRepository<Player, String> {

    Mono<Player> createPlayer(String playerId);
    Flux<Player> findByIdPlayer(String playerId);
}
