package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Track;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryTrack extends ReactiveMongoRepository<Track, String> {
}
