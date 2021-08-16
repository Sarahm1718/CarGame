package com.example.CarGame.routers.Car;

import com.example.CarGame.dtos.CarDTO;
import com.example.CarGame.dtos.GameDTO;
import com.example.CarGame.useCase.Car.EditCarUseCase;
import com.example.CarGame.useCase.Game.GameEditUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class EditCarRouter {
    @Bean
    public RouterFunction<ServerResponse> carEdit(EditCarUseCase editCarUseCase){
        return route(PUT("/car/edit").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(CarDTO.class)
                        .flatMap(carDTO -> editCarUseCase.CarEdit(carDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .bodyValue(result))
                        )
        );
    }
}
