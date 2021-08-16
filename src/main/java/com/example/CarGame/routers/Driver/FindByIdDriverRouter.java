package com.example.CarGame.routers.Driver;

import com.example.CarGame.dtos.DriverDTO;
import com.example.CarGame.useCase.Driver.FindByIdDriverUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
public class FindByIdDriverRouter {
    @Bean
    public RouterFunction<ServerResponse> getfindbyidriver(FindByIdDriverUseCase findByIdDriverUseCase){
        return route(GET("consultarDriver/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(findByIdDriverUseCase.findbyiddriver(request.pathVariable("id")), DriverDTO.class)
        );
    }
}
