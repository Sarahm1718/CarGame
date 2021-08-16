package com.example.CarGame.routers.Car;

import com.example.CarGame.dtos.CarDTO;
import com.example.CarGame.dtos.GameDTO;
import com.example.CarGame.useCase.Car.FindByIdCarUseCase;
import com.example.CarGame.useCase.Game.FindByIdGameUseCase;
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
public class FindByIdCarRouter {
    @Bean
    public RouterFunction<ServerResponse> findByIdCar(FindByIdCarUseCase findByIdCarUseCase){
        return route(GET("/car/findByIdCar").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findByIdCarUseCase.findByIdCar(request.pathVariable("id")), CarDTO.class))
        );

    }
}
