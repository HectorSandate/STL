package com.hacka.stl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacka.stl.entity.TrafficLight;
import com.hacka.stl.repository.TrafficLightRepository;

/**
 * TrafficLightServiceImpl
 */
@Service
public class TrafficLightServiceImpl implements TrafficLightService {
  private final TrafficLightRepository trafficLightRepository;

  @Autowired
  public TrafficLightServiceImpl(TrafficLightRepository trafficLightRepository) {
    this.trafficLightRepository = trafficLightRepository;
  }

  @Override
  public int getFinalGreenCount(final Long id, final int nCars, final int tPred, final int factor) {
    TrafficLight trafficLight = trafficLightRepository.findById(id).orElse(null);
    System.out.println("Hola: " + trafficLight);
    final int total = tPred + (nCars * factor);
    trafficLight.setGreenTime(total);
    trafficLightRepository.save(trafficLight);
    return total;
  }

  @Override
  public TrafficLight getTrafficLightById(final Long id) {
    return trafficLightRepository.findById(id).orElse(null);
  }

  @Override
  public TrafficLight updateTrafficLightById(Long id, TrafficLight request) {
    TrafficLight trafficLight = trafficLightRepository.findTrafficLightById(id);
    trafficLight.setGreenTime(request.getGreenTime());
    trafficLight.setStatus(request.getStatus());
    return trafficLightRepository.save(trafficLight);
  }

}
