package com.home.webservices.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:greenhouse.properties")
public class GreenhouseConfiguration {

    @Value("${greenhouse.host}")
    private String host;

    @Value("${greenhouse.path.fan.in}")
    private String fanInPath;

    @Value("${greenhouse.path.fan.out}")
    private String fanOutPath;

    @Value("${greenhouse.path.lamp.veg}")
    private String vegLampPath;

    @Value("${greenhouse.path.lamp.flower}")
    private String flowerLampPath;

    @Value("${greenhouse.path.water.pomp}")
    private String waterPompPath;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getFanInPath() {
        return fanInPath;
    }

    public void setFanInPath(String fanInPath) {
        this.fanInPath = fanInPath;
    }

    public String getFanOutPath() {
        return fanOutPath;
    }

    public void setFanOutPath(String fanOutPath) {
        this.fanOutPath = fanOutPath;
    }

    public String getVegLampPath() {
        return vegLampPath;
    }

    public void setVegLampPath(String vegLampPath) {
        this.vegLampPath = vegLampPath;
    }

    public String getFlowerLampPath() {
        return flowerLampPath;
    }

    public void setFlowerLampPath(String flowerLampPath) {
        this.flowerLampPath = flowerLampPath;
    }

    public String getWaterPompPath() {
        return waterPompPath;
    }

    public void setWaterPompPath(String waterPompPath) {
        this.waterPompPath = waterPompPath;
    }
}
