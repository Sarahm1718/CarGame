package com.example.CarGame.domain.game;


import com.example.CarGame.values.DistanceTrack;
import com.example.CarGame.values.id.GameId;
import com.example.CarGame.values.id.IdPodium;
import com.example.CarGame.values.id.IdTrack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Track")
public class Track {

    @Id
    private String trackId;
    private Integer distanceTrack;
    private String gameId;
    private String idPodium;

}
