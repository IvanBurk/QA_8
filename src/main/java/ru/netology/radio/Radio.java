package ru.netology.radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;

    public void setCurrentStation(int currentStation) {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStationValid(int currentStation) {
        this.currentStation = currentStation;
    }
}
