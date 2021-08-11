package com.example.CarGame.domain;

import com.example.CarGame.values.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Podium {
    @Id
    private IdPodium idPodium;
    private DriverId driverId;
    private FirstPlace firstPlace;
    private SecondPlace secondPlace;
    private ThirdPlace thirdPlace;

    public IdPodium getIdPodium() {
        return idPodium;
    }

    public void setIdPodium(IdPodium idPodium) {
        this.idPodium = idPodium;
    }

    public DriverId getDriverId() {
        return driverId;
    }

    public void setDriverId(DriverId driverId) {
        this.driverId = driverId;
    }

    public FirstPlace getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(FirstPlace firstPlace) {
        this.firstPlace = firstPlace;
    }

    public SecondPlace getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(SecondPlace secondPlace) {
        this.secondPlace = secondPlace;
    }

    public ThirdPlace getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(ThirdPlace thirdPlace) {
        this.thirdPlace = thirdPlace;
    }
}
