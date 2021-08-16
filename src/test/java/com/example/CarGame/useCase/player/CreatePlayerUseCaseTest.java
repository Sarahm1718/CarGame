package com.example.CarGame.useCase.player;

import com.example.CarGame.domain.game.Player;
import com.example.CarGame.dtos.PlayerDTO;
import com.example.CarGame.repository.RepositoryPlayer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@SpringBootTest
class CreatePlayerUseCaseTest {

    @SpyBean
    CreatePlayerUseCase createPlayerUseCase;

    @MockBean
    RepositoryPlayer repositoryPlayer;

    @Test
    void createPlayer(){
        var playerDTO = new PlayerDTO("34","Daniela",3,1,0,"12","34");
        var player = new Player();
        player.setPlayerId("34");
        player.setName("Daniela");
        player.setPositionFirstWinner(3);
        player.setPositionSecondWinner(1);
        player.setPositionThirdFirstWinner(0);
        player.setGameId("12");
        player.setDriverId("34");


        when(repositoryPlayer.save(Mockito.any(Player.class))).thenReturn(Mono.just(player));

        var response = createPlayerUseCase.apply(playerDTO);

        Assertions.assertEquals(response.block(), playerDTO);

    }

}