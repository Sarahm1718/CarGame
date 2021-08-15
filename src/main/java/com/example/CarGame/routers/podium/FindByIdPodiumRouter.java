package com.example.CarGame.routers.podium;


import com.example.CarGame.dtos.PodiumDTO;
import com.example.CarGame.useCase.podium.FindByIdPodiumUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Component
public class FindByIdPodiumRouter {
    @Bean
    public RouterFunction<ServerResponse>getfindbyidpodium(FindByIdPodiumUseCase findByIdPodiumUseCase){
        return route(GET("consultarPodium/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                .body(findByIdPodiumUseCase.getfindbyid(request.pathVariable("id")), PodiumDTO.class)
                );
    }
}
