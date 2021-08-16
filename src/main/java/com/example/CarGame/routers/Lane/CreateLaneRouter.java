package com.example.CarGame.routers.Lane;

import com.example.CarGame.dtos.LaneDTO;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.useCase.Lane.CreateLaneUseCase;
import com.example.CarGame.useCase.podium.CreatePodiumUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateLaneRouter {
    @Bean
    public RouterFunction<ServerResponse> createLane(CreateLaneUseCase createLaneUseCase){
        return route(POST("/createLane").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(LaneDTO.class).flatMap(laneDTO -> createLaneUseCase.apply(laneDTO)
                        .flatMap(result -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(result)
                        )
                )
        );
    }
}
