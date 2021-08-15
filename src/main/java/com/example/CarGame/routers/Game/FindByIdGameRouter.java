package com.example.CarGame.routers.Game;

import com.example.CarGame.dtos.GameDTO;
import com.example.CarGame.useCase.Game.FindByIdGameUseCase;
import com.example.CarGame.useCase.Game.GameEditUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByIdGameRouter {
    @Bean
    public RouterFunction<ServerResponse> findByIdGame(FindByIdGameUseCase findByIdGameUseCase){
        return route(GET("/game/findByIdGame").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(findByIdGameUseCase.findByIdGame(request.pathVariable("id")), GameDTO.class))
                        );

    }
}
