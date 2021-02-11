package com.home.webservices.controller;

import com.home.webservices.entity.GreenhouseMonitor;
import com.home.webservices.entity.GreenhouseSchedule;
import com.home.webservices.models.Greenhouse;
import com.home.webservices.repository.GreenhouseMonitorRepository;
import com.home.webservices.repository.GreenhouseScheduleRepository;
import com.home.webservices.services.GreenhouseHttpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class GreenhouseController {

    private final GreenhouseMonitorRepository greenhouseMonitorRepository;

    private final GreenhouseScheduleRepository greenhouseScheduleRepository;

    private final GreenhouseHttpService greenhouseHttpService;

    public GreenhouseController(GreenhouseMonitorRepository greenhouseMonitorRepository, GreenhouseScheduleRepository greenhouseScheduleRepository, GreenhouseHttpService greenhouseHttpService) {
        this.greenhouseMonitorRepository = greenhouseMonitorRepository;
        this.greenhouseScheduleRepository = greenhouseScheduleRepository;
        this.greenhouseHttpService = greenhouseHttpService;
    }

    @GetMapping(path = "/monitor")
    public @ResponseBody
    Iterable<GreenhouseMonitor> queryGreenhouseMonitor() {
        return greenhouseMonitorRepository.findAll();
    }

    @GetMapping(path = "/schedule")
    public @ResponseBody
    Iterable<GreenhouseSchedule> queryGreenhouseSchedule() {
        return greenhouseScheduleRepository.findAll();
    }

    @GetMapping(path = "/schedule/id")
    public @ResponseBody
    Optional<GreenhouseSchedule> queryGreenhouseScheduleById(@RequestParam Byte id) {
        return greenhouseScheduleRepository.findById(id);
    }

    @GetMapping(path = "/greenhouse")
    public @ResponseBody
    Greenhouse getSensors() {
        return greenhouseHttpService.getGreenhouseStatus();
    }

}
