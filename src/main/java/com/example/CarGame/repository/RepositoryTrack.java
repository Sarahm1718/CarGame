package com.example.CarGame.repository;

import com.example.CarGame.domain.game.Track;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTrack extends ReactiveMongoRepository<Track, String> {
}
