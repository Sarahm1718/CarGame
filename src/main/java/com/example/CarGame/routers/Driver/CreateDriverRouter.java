package com.example.CarGame.routers.Driver;

import com.example.CarGame.dtos.DriverDTO;
import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.useCase.Driver.CreateDriverUseCase;
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
public class CreateDriverRouter {
    @Bean
    public RouterFunction<ServerResponse> createDriver(CreateDriverUseCase createDriverUseCase){
        return route(POST("/createDriver").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(DriverDTO.class).flatMap(driverDTO -> createDriverUseCase.apply(driverDTO)
                        .flatMap(result -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(result)
                        )
                )
        );
    }
}
