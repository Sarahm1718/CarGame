package com.example.CarGame.dtos;

import com.example.CarGame.values.*;

public class PodiumDTO {
    private String idPodium;
    private String driverId;
    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;

    public String getIdPodium() {
        return idPodium;
    }

    public void setIdPodium(String idPodium) {
        this.idPodium = idPodium;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(String firstPlace) {
        this.firstPlace = firstPlace;
    }

    public String getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(String secondPlace) {
        this.secondPlace = secondPlace;
    }

    public String getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(String thirdPlace) {
        this.thirdPlace = thirdPlace;
    }
}
