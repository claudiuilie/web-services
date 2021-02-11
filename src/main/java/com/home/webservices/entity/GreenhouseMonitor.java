package com.home.webservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "greenhouse_monitor")
public class GreenhouseMonitor {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "temperature", length = 3)
    private int temperature;

    @Column(name = "humidity", length = 3)
    private int humidity;

    @Column(name = "soil_moisture", length = 4)
    private int soilMoistureProcent;

    @Column(name = "pomp_off")
    private Boolean waterPompOff;

    @Column(name = "veg_lamp_off")
    private Boolean vegLampOff;

    @Column(name = "fruit_lamp_off")
    private Boolean flowerLampOff;

    @Column(name = "fan_in", length = 3)
    private int fanIn;

    @Column(name = "fan_out", length = 3)
    private int fanOut;

    @Column(name = "date")
    private Date date;

    @Column(name = "modified")
    private Timestamp modified;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getSoilMoistureProcent() {
        return soilMoistureProcent;
    }

    public void setSoilMoistureProcent(int soilMoistureProcent) {
        this.soilMoistureProcent = soilMoistureProcent;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
