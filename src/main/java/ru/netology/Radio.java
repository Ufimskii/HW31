package ru.netology;

public class Radio {
//    private String name;
    private int maxValume;
    private int minValume;
    private int currentValume;
    private int maxStation;
    private int minStation;
    private int currentStation;
//    private boolean on;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    //Вкл. и Выкл.
//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }

    // ГРОМКОСТЬ
// Максимальная громкость
    public int getMaxValume() {
        return maxValume;
    }

    public void setMaxValume(int maxValume) {
        this.maxValume = 10;
    }

    // Минимальная  громкость
    public int getMinValume() {
        return minValume;
    }

    public void setMinValume(int minValume) {
        this.minValume = 0;
    }

    // Текущая громкость
    public int getCurrentValume() {
        return currentValume;
    }
    public void setCurrentValume(int currentValume) {
        this.currentValume = currentValume;}
    //Увеличение громкости +
    public void upVolume() {
        if (currentValume == maxValume) {
            return;
        }
        this.currentValume++;
    }


    //Уменьшение громкости -
    public void downVolume() {
        if (currentValume == minValume) {
            return;
        }
        this.currentValume--;
    }


// СТАНЦИИ

    // Максимальная станция
    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = 9;
    }

    // Минимальная  станция
    public int getMinStation() {
        return minStation;
    }
    public void setMinStation(int minStation) {
        this.minStation = 0;
    }

    // Текущая станция
    public int getCurrentStation() {
        return currentStation;
    }
       //Увеличение станции
    public void upStation() {
        if (currentStation < maxStation) {
            currentStation ++;
        }
        this.currentStation = minStation;
    }
    //Уменьшение станции
    public void downStation() {
        if (currentStation > minStation) {
            currentStation --;
        }
        this.currentStation = maxStation;
    }



    //Установка текущей станции
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

}
