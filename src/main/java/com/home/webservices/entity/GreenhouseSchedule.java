package com.home.webservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "greenhouse_schedule")
public class GreenhouseSchedule {

    @Id
    @Column(name = "id", length = 4)
    private Byte id;

    @Column(name = "veg_phase")
    private Boolean vegPhase;

    @Column(name = "fruit_phase")
    private Boolean flowerPhase;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "lamp_start")
    private int lampStart;

    @Column(name = "lamp_stop")
    private int lampStop;

    @Column(name = "modified")
    private Timestamp modified;

    @Column(name = "date")
    private Date date;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Boolean getVegPhase() {
        return vegPhase;
    }

    public void setVegPhase(Boolean vegPhase) {
        this.vegPhase = vegPhase;
    }

    public Boolean getFlowerPhase() {
        return flowerPhase;
    }

    public void setFlowerPhase(Boolean flowerPhase) {
        this.flowerPhase = flowerPhase;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getLampStart() {
        return lampStart;
    }

    public void setLampStart(int lampStart) {
        this.lampStart = lampStart;
    }

    public int getLampStop() {
        return lampStop;
    }

    public void setLampStop(int lampStop) {
        this.lampStop = lampStop;
    }

    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
