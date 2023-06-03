package com.pro.enrich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo.
 *
 * @author thuan
 */
@RestController
public class DemoController {
  private Coach myCoach;

  @Autowired
  public DemoController(Coach theCoach) {
    myCoach = theCoach;
  }

  @GetMapping("/daily")
  public String getDailyWorkout() {
    return myCoach.getDailyyWorkout();
  }
}
