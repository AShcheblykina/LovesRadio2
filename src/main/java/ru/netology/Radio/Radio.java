package ru.netology.Radio;

public class Radio {
    private int MinNumberStations = 10;
    private int MaxNumberStation = 29;
    private int StationNumber = MinNumberStations;
    private int SoundVolume;

    public Radio(int MinNumberStation, int MaxNumberStation) {
        this.MinNumberStations = MinNumberStation;
        this.MaxNumberStation = MaxNumberStation;
        this.StationNumber =MinNumberStation;
    }

    public Radio(int size) {
        MaxNumberStation = MinNumberStations + size;
    }

    public int getStationNumber() {
        return StationNumber;
    }
    public int getMinNumberStations() {
        return MinNumberStations;
    }
    public int getMaxNumberStation() {
        return MaxNumberStation;
    }

    public void setStationNumber(int StationNumber) {
        if (StationNumber < 0) {
            return;
        }
        if (StationNumber > 9) {
            return;
        }
        this.StationNumber = StationNumber;
    }

    public int getSoundVolume() {
        return SoundVolume;
    }

    public void setSoundVolume(int SoundVolume) {
        if (SoundVolume < 0) {
            return;
        }
        if (SoundVolume > 100) {
            return;
        }
        this.SoundVolume = SoundVolume;
    }

    public void InCreaseVolume() {
        if (SoundVolume < 100) {
            SoundVolume = SoundVolume + 1;
        }
    }

    public void NextStation() {
        if (StationNumber != 9) {
            StationNumber++;
        } else {
            StationNumber = 0;
        }
    }

    public void PrevStation() {
        if (StationNumber != 0) {
            StationNumber++;
        }
    }
}

