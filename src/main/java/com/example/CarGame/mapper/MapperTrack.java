package com.example.CarGame.mapper;

import com.example.CarGame.domain.game.Track;
import com.example.CarGame.dtos.TrackDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperTrack {
    public Function<TrackDTO, Track> mapperToTrack(String id){
        return  updateTrack -> {
            Track track = new Track();
            track.setTrackId(id);
            track.setDistanceTrack(updateTrack.getDistanceTrack());
            track.setGameId(updateTrack.getGameId());
            track.setIdPodium(updateTrack.getIdPodium());
            return track;
        };
    }

    public Function<Track,TrackDTO> mapperToTrackDTO(){
        return track -> new TrackDTO(
                track.getTrackId(),
                track.getDistanceTrack(),
                track.getGameId(),
                track.getIdPodium()
        );
    }
}
