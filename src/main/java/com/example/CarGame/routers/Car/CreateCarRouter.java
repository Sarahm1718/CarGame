package com.example.CarGame.routers.Car;

import com.example.CarGame.dtos.CarDTO;
import com.example.CarGame.useCase.Car.CreateCarUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateCarRouter {
    @Bean
    public RouterFunction<ServerResponse> CreateCarRouter(CreateCarUseCase createCarUseCase){
        return  route(POST("/carCreate").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(CarDTO.class)
                        .flatMap(carDTO -> createCarUseCase.CarCreate(carDTO)
                                .flatMap(result -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))


                        )
        );
    }
}
