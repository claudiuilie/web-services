package com.home.webservices.repository;

import com.home.webservices.entity.GreenhouseSchedule;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GreenhouseScheduleRepository extends CrudRepository<GreenhouseSchedule,Long> {

    Optional<GreenhouseSchedule> findById(Byte id);
}
