package com.home.webservices.repository;

import com.home.webservices.entity.GreenhouseMonitor;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface GreenhouseMonitorRepository extends CrudRepository<GreenhouseMonitor, Long> {

    List<GreenhouseMonitor> findByDate(Date date);

}
