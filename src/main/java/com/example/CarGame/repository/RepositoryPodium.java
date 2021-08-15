package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Podium;
import com.example.CarGame.dtos.PodiumDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryPodium extends ReactiveMongoRepository<Podium, String> {
}
