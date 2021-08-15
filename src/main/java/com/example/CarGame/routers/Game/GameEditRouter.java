package com.example.CarGame.routers.Game;

import com.example.CarGame.dtos.GameDTO;
import com.example.CarGame.useCase.Game.GameEditUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class GameEditRouter {

    @Bean
    public RouterFunction<ServerResponse> gameEdit(GameEditUseCase gameEditUsecase){
        return route(PUT("/game/edit").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(GameDTO.class)
                        .flatMap(gameDTO -> gameEditUsecase.GameEdit(gameDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .bodyValue(result))
                        )
        );
    }
}
