package com.home.webservices.models;

import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Timestamp;

@Component
public class GreenhouseMonitor {

    private int id;

    private int humidity;

    private int soilMoisture;

    private int fanIn;

    private int fanOut;

    private Boolean waterPompOff;

    private Boolean vegLampOff;

    private Boolean flowerLampOff;

    private Date date;

    private Timestamp modified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(int soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public int getFanIn() {
        return fanIn;
    }

    public void setFanIn(int fanIn) {
        this.fanIn = fanIn;
    }

    public int getFanOut() {
        return fanOut;
    }

    public void setFanOut(int fanOut) {
        this.fanOut = fanOut;
    }

    public Boolean getWaterPompOff() {
        return waterPompOff;
    }

    public void setWaterPompOff(Boolean waterPompOff) {
        this.waterPompOff = waterPompOff;
    }

    public Boolean getVegLampOff() {
        return vegLampOff;
    }

    public void setVegLampOff(Boolean vegLampOff) {
        this.vegLampOff = vegLampOff;
    }

    public Boolean getFlowerLampOff() {
        return flowerLampOff;
    }

    public void setFlowerLampOff(Boolean flowerLampOff) {
        this.flowerLampOff = flowerLampOff;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }
}


