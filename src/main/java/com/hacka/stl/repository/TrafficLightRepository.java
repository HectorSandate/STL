package com.hacka.stl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hacka.stl.entity.TrafficLight;

/**
 * TrafficLightRepository
 */
@Repository
public interface TrafficLightRepository extends JpaRepository<TrafficLight, Long> {
  TrafficLight findTrafficLightById(Long id);
}
