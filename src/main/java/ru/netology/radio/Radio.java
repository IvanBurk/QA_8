package ru.netology.radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int increaseVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public void setCurrentStationNext(int currentStation) {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentStationPrew(int currentStation) {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStationValid(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setIncreaseVolumeUp(int increaseVolume) {
        if (increaseVolume > maxVolume) {
            this.increaseVolume = maxVolume;
            return;
        } else {
            this.increaseVolume = increaseVolume + 1;
        }
    }

    public void setIncreaseVolumeDown(int increaseVolume) {
        if (increaseVolume < minVolume) {
            this.increaseVolume = minVolume;
            return;
        } else {
            this.increaseVolume = increaseVolume - 1;
        }
    }

    public int getIncreaseVolume() {
       return increaseVolume;
    }
}
