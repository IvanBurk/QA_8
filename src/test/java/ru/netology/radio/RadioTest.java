package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void currentStationNext() {
        Radio dance = new Radio();
        dance.setCurrentStation(9);
        int actual = dance.getCurrentStation();

        assertEquals(0, actual);
    }


    @Test
    void currentStationPrew() {
        Radio dance = new Radio();
        dance.setCurrentStation(0);
        int actual = dance.getCurrentStation();

        assertEquals(9, actual);
    }


    @Test
    void currentStation() {
        Radio dance = new Radio();
        dance.setCurrentStation(5);
        int actual = dance.getCurrentStation();

        assertEquals(6, actual);
    }

    @Test
    void currentStationValid() {
        Radio dance = new Radio();
        dance.setCurrentStationValid(5);
        int actual = dance.getCurrentStation();

        assertEquals(5, actual);
    }
}
