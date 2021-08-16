package com.example.CarGame.routers.Lane;

import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.useCase.Lane.FindByIdLaneUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
public class FindByIdLaneRouter {
    @Bean
    public RouterFunction<ServerResponse> findbyidlane(FindByIdLaneUseCase findByIdLaneUseCase){
        return route(GET("consultarLane/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(findByIdLaneUseCase.findbyidLane(request.pathVariable("id")), PodiumDTO.class)
        );
    }
}
