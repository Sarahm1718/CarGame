package com.example.CarGame.routers.podium;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.useCase.podium.CreatePodiumUseCase;
import com.example.CarGame.useCase.podium.EditPodiumUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class EditPodiumRouter {
    @Bean
    public RouterFunction<ServerResponse> editPodium(EditPodiumUseCase editPodiumUseCase){
        return route(PUT("/editPodium").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(PodiumDTO.class).flatMap(podiumDTO -> editPodiumUseCase.apply(podiumDTO)
                        .flatMap(result -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(result)
                        )
                )
        );
    }
}
