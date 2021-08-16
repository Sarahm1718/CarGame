package com.example.CarGame.routers.Track;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.dtos.TrackDTO;
import com.example.CarGame.useCase.Track.CreateTrackUseCase;
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
public class CreateTrackRouter {
    @Bean
    public RouterFunction<ServerResponse> createTrack(CreateTrackUseCase createTrackUseCase){
        return route(POST("/createTrack").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(TrackDTO.class).flatMap(trackDTO -> createTrackUseCase.apply(trackDTO)
                        .flatMap(result -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(result)
                        )
                )
        );
    }
}
