package com.hacka.stl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hacka.stl.entity.TrafficLight;
import com.hacka.stl.service.TrafficLightService;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * TrafficLightController
 */
@RestController
@RequestMapping
public class TrafficLightController {

  @Autowired
  private TrafficLightService trafficLightService;

  @GetMapping("/calculateGreen")
  public int getGreenTime(@RequestParam Long id, @RequestParam int nCars, @RequestParam int tPred,
      @RequestParam int factor) {
    return trafficLightService.getFinalGreenCount(id, nCars, tPred, factor);
  }

  @GetMapping("/trafficLight")
  public ResponseEntity<TrafficLight> getTrafficLightById(@RequestParam final Long id) {
    TrafficLight trafficLight = trafficLightService.getTrafficLightById(id);
    return new ResponseEntity<>(trafficLight, HttpStatus.OK);
  }

  @PutMapping("/update")
  public TrafficLight updateTrafficLightById(@RequestParam final Long id, @RequestBody TrafficLight trafficLight) {
    return trafficLightService.updateTrafficLightById(id, trafficLight);
  }
}
