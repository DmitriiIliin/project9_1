package ru.netology.project9.project9mvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // номер радиостанции
    @Test
    public void middleNumberStation5() {
        Radio radio = new Radio();
        radio.setNumberStation(5);
        int expected = 5;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beforeLatestNumberStation8() {
        Radio radio = new Radio();
        radio.setNumberStation(8);
        int expected = 8;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void latestNumberStation9() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveHighLimitNumberStation10() {
        Radio radio = new Radio();
        radio.setNumberStation(10);
        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroNumberStation0() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstNumberStation1() {
        Radio radio = new Radio();
        radio.setNumberStation(1);
        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unrealNumberStationMinus1() {
        Radio radio = new Radio();
        radio.setNumberStation(-1);
        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unrealNumberStationMinus5() {
        Radio radio = new Radio();
        radio.setNumberStation(-5);
        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    // уровень громкости
    @Test
    public void middleLevelVolume50() {
        Radio radio = new Radio();
        radio.setLevelVolume(50);
        int expected = 50;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstLevelVolume1() {
        Radio radio = new Radio();
        radio.setLevelVolume(1);
        int expected = 1;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroLevelVolume0() {
        Radio radio = new Radio();
        radio.setLevelVolume(0);
        int expected = 0;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unrealLevelVolumeMinus1() {
        Radio radio = new Radio();
        radio.setLevelVolume(-1);
        int expected = 0;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void unrealLevelVolumeMinus5() {
        Radio radio = new Radio();
        radio.setLevelVolume(-5);
        int expected = 0;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beforeMaxLevelVolume99() {
        Radio radio = new Radio();
        radio.setLevelVolume(99);
        int expected = 99;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxLevelVolume100() {
        Radio radio = new Radio();
        radio.setLevelVolume(100);
        int expected = 100;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxLevelVolume101() {
        Radio radio = new Radio();
        radio.setLevelVolume(101);
        int expected = 100;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void afterMaxLevelVolume() {
        Radio radio = new Radio();
        radio.setLevelVolume(150);
        int expected = 100;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
    // Увеличение/уменьшение номера станции

    @Test
    public void reduceMiddleNumberStation5() {
        Radio radio = new Radio();

        radio.setNumberStation(5);
        radio.beforeNumberStation();
        int expected = 4;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMiddleNumberStation5() {
        Radio radio = new Radio();

        radio.setNumberStation(5);
        radio.afterNumberStation();
        int expected = 6;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceLatestNumberStation9() {
        Radio radio = new Radio();

        radio.setNumberStation(9);
        radio.beforeNumberStation();
        int expected = 8;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseLatestNumberStation9() {
        Radio radio = new Radio();

        radio.setNumberStation(9);
        radio.afterNumberStation();
        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNullNumberStation0() {
        Radio radio = new Radio();

        radio.setNumberStation(0);
        radio.afterNumberStation();
        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceNullNumberStation0() {
        Radio radio = new Radio();

        radio.setNumberStation(0);
        radio.beforeNumberStation();
        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    // Уменьшение/ увеличение громкости
    @Test
    public void reduceLevelVolumeInTheMiddle50() {
        Radio radio = new Radio();
        radio.setLevelVolume(50);
        radio.beforeLevelVolume();
        int expected = 49;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseLevelVolumeInTheMiddle50() {
        Radio radio = new Radio();
        radio.setLevelVolume(50);
        radio.afterLevelVolume();
        int expected = 51;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceLevelVolumeInNull0() {
        Radio radio = new Radio();
        radio.setLevelVolume(0);
        radio.beforeLevelVolume();
        int expected = 0;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseLevelVolumeInNull0() {
        Radio radio = new Radio();
        radio.setLevelVolume(0);
        radio.afterLevelVolume();
        int expected = 1;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceLevelVolumeInOneHundred100() {
        Radio radio = new Radio();
        radio.setLevelVolume(100);
        radio.beforeLevelVolume();
        int expected = 99;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseLevelVolumeInOneHundred100() {
        Radio radio = new Radio();
        radio.setLevelVolume(100);
        radio.afterLevelVolume();
        int expected = 100;
        int actual = radio.getLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
}