package com.hacka.stl.service;

import com.hacka.stl.entity.TrafficLight;

/**
 * TrafficLightService
 */
public interface TrafficLightService {

  public int getFinalGreenCount(final Long id, final int nCars, final int tPred, final int factor);

  public TrafficLight getTrafficLightById(final Long id);

  public TrafficLight updateTrafficLightById(final Long id, TrafficLight request);
}
