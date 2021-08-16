package com.example.CarGame.routers.Track;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.dtos.TrackDTO;
import com.example.CarGame.useCase.Track.FindByIdTrackUseCase;
import com.example.CarGame.useCase.podium.FindByIdPodiumUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindByIdTrackRouter {
    @Bean
    public RouterFunction<ServerResponse> findbyidtrack(FindByIdTrackUseCase findByIdTrackUseCase){
        return route(GET("consultarTrack/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(findByIdTrackUseCase.getfindbyidtrack(request.pathVariable("id")), TrackDTO.class)
        );
    }
}
