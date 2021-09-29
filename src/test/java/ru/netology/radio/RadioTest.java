package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void currentStationNext() {
        Radio dance = new Radio();
        dance.setCurrentStationNext(9);
        int actual = dance.getCurrentStation();

        assertEquals(0, actual);
    }


    @Test
    void currentStationPrew() {
        Radio dance = new Radio();
        dance.setCurrentStationNext(0);
        int actual = dance.getCurrentStation();

        assertEquals(1, actual);
    }


    @Test
    void currentStation() {
        Radio dance = new Radio();
        dance.setCurrentStationNext(5);
        int actual = dance.getCurrentStation();

        assertEquals(6, actual);
    }

    @Test
    void currentStationReverse() {
        Radio dance = new Radio();
        dance.setCurrentStationPrew(9);
        int actual = dance.getCurrentStation();

        assertEquals(8, actual);
    }

    @Test
    void currentStationReversePrew() {
        Radio dance = new Radio();
        dance.setCurrentStationPrew(0);
        int actual = dance.getCurrentStation();

        assertEquals(9, actual);
    }

    @Test
    void currentStationValid() {
        Radio dance = new Radio();
        dance.setCurrentStationValid(5);
        int actual = dance.getCurrentStation();

        assertEquals(5, actual);
    }

    @Test
    void increaseVolume() {
        Radio dance_v = new Radio();
        dance_v.setIncreaseVolumeUp(11);
        int actual = dance_v.getIncreaseVolume();

        assertEquals(10, actual);
    }

    @Test
    void increaseVolumeNext() {
        Radio dance_v = new Radio();
        dance_v.setIncreaseVolumeUp(6);
        int actual = dance_v.getIncreaseVolume();

        assertEquals(7, actual);
    }

    @Test
    void increaseVolumePrew() {
        Radio dance_v = new Radio();
        dance_v.setIncreaseVolumeDown(6);
        int actual = dance_v.getIncreaseVolume();

        assertEquals(5, actual);
    }

    @Test
    void increaseVolumePrev() {
        Radio dance_v = new Radio();
        dance_v.setIncreaseVolumeDown(-1);
        int actual = dance_v.getIncreaseVolume();
        assertEquals(0, actual);
    }
}
