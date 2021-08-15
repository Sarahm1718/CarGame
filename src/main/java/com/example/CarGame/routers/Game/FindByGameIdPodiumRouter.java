package com.example.CarGame.routers.Game;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.useCase.podium.FindByGameIdPodiumUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
@Configuration
public class FindByGameIdPodiumRouter {

    @Bean
    public RouterFunction<ServerResponse> findByGameIdPodiumRouter(FindByGameIdPodiumUseCase findByGameIdPodiumUseCase){
        return route(GET("/players/game/{gameid}").and(accept(MediaType.TEXT_PLAIN)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByGameIdPodiumUseCase.getPodiumByGameId(request.pathVariable("gameid")), PodiumDTO.class))
        );
}}
