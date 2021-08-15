package com.example.CarGame.useCase.Game;
import com.example.CarGame.dtos.GameDTO;
import com.example.CarGame.mapper.MapperGame;
import com.example.CarGame.repository.RepositoryGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class GameEditUseCase {
    private final RepositoryGame repositoryGame;
    private final MapperGame mapperGame;

    @Autowired
    public GameEditUseCase(RepositoryGame repositoryGame, MapperGame mapperGame) {
        this.repositoryGame = repositoryGame;
        this.mapperGame = mapperGame;
    }

    public Mono<GameDTO> GameEdit(GameDTO gameDTO){
        return repositoryGame.save(mapperGame.mapperToGame(gameDTO.getGameId())
                .apply(gameDTO))
                .map(mapperGame.mapperToGameDTO());
    }
}
