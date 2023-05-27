package com.fpt.EnrichWeek1;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

  @Override
  public String getDailyyWorkout() {
    return "Yahoo!!!";
  }
}
