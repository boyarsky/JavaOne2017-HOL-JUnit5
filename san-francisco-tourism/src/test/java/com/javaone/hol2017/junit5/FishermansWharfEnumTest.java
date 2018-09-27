package com.javaone.hol2017.junit5;

import org.junit.Test;

import java.time.LocalTime;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

public class FishermansWharfEnumTest {

  @Test
  public void allClosingTimesAfter9pm() {
    LocalTime ninePm = LocalTime.of(12 + 9, 0);
    for (FishermansWharfEnum current : FishermansWharfEnum.values()) {
      assertThat(current + " should close after 9pm", current.closes(), greaterThanOrEqualTo(ninePm));
    }
  }

}
