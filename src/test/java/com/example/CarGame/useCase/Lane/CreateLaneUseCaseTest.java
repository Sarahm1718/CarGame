package com.example.CarGame.useCase.Lane;

import com.example.CarGame.domain.Lane;
import com.example.CarGame.dtos.LaneDTO;
import com.example.CarGame.repository.RepositoryLane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@SpringBootTest
class CreateLaneUseCaseTest {

    @SpyBean
    CreateLaneUseCase createLaneUseCase;

    @MockBean
    RepositoryLane repositoryLane;

    @Test
    void createLane(){
        var laneDTO = new LaneDTO("34","8","12","4","11");
        var lane = new Lane();
        lane.setIdLane("34");
        lane.setIdCar("8");
        lane.setGameId("12");
        lane.setIdTrack("4");
        lane.setDriverId("11");

        when(repositoryLane.save(Mockito.any(Lane.class))).thenReturn(Mono.just(lane));

        var response = createLaneUseCase.apply(laneDTO);

        Assertions.assertEquals(response.block(), laneDTO);
    }



}