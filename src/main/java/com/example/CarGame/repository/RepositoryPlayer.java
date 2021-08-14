package com.example.CarGame.repository;

import com.example.CarGame.domain.Player;
import com.example.CarGame.dtos.PlayerDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RepositoryPlayer extends ReactiveMongoRepository<PlayerDTO, String> {

}
