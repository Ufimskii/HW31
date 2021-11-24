package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

//    @Test
//    public void shouldCreate () { Radio radio = new Radio(); }
//    @Test
//    public void shouldName() {
//        Radio radio = new Radio();
//        String expected = "Радио Га Га";
//        assertNull(radio.getName());
//        radio.setName(expected);
//        assertEquals(expected, radio.getName());
//    }


    @Test
    public void shouldUpCurrentSatation() {
        Radio radio = new Radio();
        assertEquals(8, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.upStation();
    }

//    @Test
//    public void getCurrentValume() {
//        Radio radio = new Radio();
//        radio.setCurrentValume(4);
//
//    }
//
//    @Test
//    void upVolume() {
//    }
//
//    @Test
//    void downVolume() {
//    }
//
//    @Test
//    void getCurrentStation() {
//    }
//
//    @Test
//    void upStation() {
//    }
//
//    @Test
//    void downStation() {
//    }
}