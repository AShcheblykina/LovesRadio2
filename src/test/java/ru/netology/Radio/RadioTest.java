package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void NextStationNumber() {
        Radio radio = new Radio(8);

        radio.setStationNumber(8);

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);

    }

}


