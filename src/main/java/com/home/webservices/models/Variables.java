package com.home.webservices.models;

import org.springframework.stereotype.Component;

public class Variables {

    private int temperature;

    private int humidity;

    private int soil_moisture;

    private int fan_in;

    private int fan_out;

    private Boolean pomp_off;

    private Boolean veg_lamp_off;

    private Boolean fruit_lamp_off;

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

    public int getSoil_moisture() {
        return soil_moisture;
    }

    public void setSoil_moisture(int soil_moisture) {
        this.soil_moisture = soil_moisture;
    }

    public int getFan_in() {
        return fan_in;
    }

    public void setFan_in(int fan_in) {
        this.fan_in = fan_in;
    }

    public int getFan_out() {
        return fan_out;
    }

    public void setFan_out(int fan_out) {
        this.fan_out = fan_out;
    }

    public Boolean getPomp_off() {
        return pomp_off;
    }

    public void setPomp_off(Boolean pomp_off) {
        this.pomp_off = pomp_off;
    }

    public Boolean getVeg_lamp_off() {
        return veg_lamp_off;
    }

    public void setVeg_lamp_off(Boolean veg_lamp_off) {
        this.veg_lamp_off = veg_lamp_off;
    }

    public Boolean getFruit_lamp_off() {
        return fruit_lamp_off;
    }

    public void setFruit_lamp_off(Boolean fruit_lamp_off) {
        this.fruit_lamp_off = fruit_lamp_off;
    }

}

