package com.example.CarGame.routers.Game;

import com.example.CarGame.dtos.GameDTO;
import com.example.CarGame.useCase.Game.CreateGameUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateGameRouter {

    @Bean
    public RouterFunction<ServerResponse> gameCreate(CreateGameUseCase createGameUseCase){
        return route(POST("/game/create").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(GameDTO.class)
                        .flatMap(gameDTO -> createGameUseCase.GameCreate(gameDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
