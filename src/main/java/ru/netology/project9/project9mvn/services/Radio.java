package ru.netology.project9.project9mvn.services;

public class Radio {
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int currentNumberStation = minNumberStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int numberStation;
    private int levelVolume;

    public Radio(int countStation) {
        minNumberStation = 0;
        maxNumberStation = countStation - 1;
        currentNumberStation = numberStation;

        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        currentVolume = levelVolume;
    }

    public Radio() {

    }


    public int getNumberStation() {
        return numberStation;
    }

    public int getLevelVolume() {
        return levelVolume;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < minNumberStation) {
            newNumberStation = maxNumberStation;
        }
        if (newNumberStation > maxNumberStation) {
            newNumberStation = minNumberStation;
        }
        numberStation = newNumberStation;
    }

    public void setLevelVolume(int newLevelVolume) {
        if (newLevelVolume < minVolume) {
            newLevelVolume = minVolume;
        }
        if (newLevelVolume > maxVolume) {
            newLevelVolume = maxVolume;
        }
        levelVolume = newLevelVolume;
    }


    public void beforeNumberStation() {
        numberStation = numberStation - 1;
        if (numberStation < minNumberStation) {
            numberStation = maxNumberStation;
        }

    }

    public void afterNumberStation() {
        numberStation = numberStation + 1;
        if (numberStation > maxNumberStation) {
            numberStation = minNumberStation;
        }

    }

    public void beforeLevelVolume() {
        levelVolume = levelVolume - 1;
        if (levelVolume < minVolume) {
            levelVolume = minVolume;
        }
    }

    public void afterLevelVolume() {
        levelVolume = levelVolume + 1;
        if (levelVolume > maxVolume) {
            levelVolume = maxVolume;
        }
    }
}

