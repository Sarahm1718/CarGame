package com.example.CarGame.mapper;

import com.example.CarGame.domain.Lane;
import com.example.CarGame.dtos.LaneDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperLane {
    public Function<LaneDTO, Lane> mapperToLane(String id){
        return updateLane -> {
            Lane lane = new Lane();
            lane.setIdLane(id);
            lane.setIdCar(updateLane.getIdCar());
            lane.setGameId(updateLane.getGameId());
            lane.setIdTrack(updateLane.getIdTrack());
            lane.setDriverId(updateLane.getDriverId());
            return  lane;
        };
    }

    public Function<Lane,LaneDTO> mapperToLaneDTO(){
        return lane -> new LaneDTO(
                lane.getIdLane(),
                lane.getIdCar(),
                lane.getGameId(),
                lane.getIdTrack(),
                lane.getDriverId()
        );
    }
}
