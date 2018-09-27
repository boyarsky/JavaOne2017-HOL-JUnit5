package com.javaone.hol2017.junit5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CableCarWaitTest {

  @Mock
  CableCarSchedule mockSchedule;

  CableCarWait target;

  @Before
  public void setUp() {
    target = new CableCarWait(mockSchedule);
  }

  @Test
  public void plentyOfTime() {
    LocalTime noon = LocalTime.of(12, 0);
    LocalTime halfHourEarlier = LocalTime.of(11, 30);
    when(mockSchedule.nextCar()).thenReturn(noon);
    assertThat(target.timeForHotDog(halfHourEarlier)).isTrue();
  }

  @Test
  public void anyMinuteNow() {
    LocalTime noon = LocalTime.of(12, 0);
    LocalTime justEarlier = LocalTime.of(11, 59);
    when(mockSchedule.nextCar()).thenReturn(noon);
    assertThat(target.timeForHotDog(justEarlier)).isFalse();
  }

  @Test
  public void barelyEnoughTime() {
    LocalTime noon = LocalTime.of(12, 0);
    LocalTime fifteenMinutesEarlier = LocalTime.of(11, 45);
    when(mockSchedule.nextCar()).thenReturn(noon);
    assertFalse(target.timeForHotDog(fifteenMinutesEarlier));
  }
}
