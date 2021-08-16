package com.example.CarGame.routers.player;

import com.example.CarGame.dtos.PlayerDTO;
import com.example.CarGame.useCase.player.FindByIdPlayerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration

public class FindByIdPlayerRouter {
    @Bean
    public RouterFunction<ServerResponse> findByIdPlayer(FindByIdPlayerUseCase findByIdPlayerUseCase){
        return route(GET("/traerPlayer/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByIdPlayerUseCase.findById(request.pathVariable("id")), PlayerDTO.class))
        );
    }
}
