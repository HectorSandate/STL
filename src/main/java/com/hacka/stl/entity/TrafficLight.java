package com.hacka.stl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TrafficLight {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "t_pred", nullable = false)
  private int pred;

  @Column(name = "green_time", nullable = false)
  private int greenTime;

  @Column(name = "status", nullable = false)
  private Boolean status;

}
