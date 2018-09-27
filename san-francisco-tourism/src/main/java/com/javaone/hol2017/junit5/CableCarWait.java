package com.javaone.hol2017.junit5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("WeakerAccess")
public class CableCarWait {

  private CableCarSchedule schedule;

  public CableCarWait(CableCarSchedule schedule) {
    this.schedule = schedule;
  }

  public boolean timeForHotDog(LocalTime now) {
    LocalTime nextCar = schedule.nextCar();
    long minutesLeft = now.until(nextCar, ChronoUnit.MINUTES);
    return minutesLeft > 15;
  }
}
