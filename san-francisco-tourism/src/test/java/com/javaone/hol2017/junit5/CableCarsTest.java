package com.javaone.hol2017.junit5;

import org.junit.Test;

import org.assertj.core.api.SoftAssertions;

import static org.assertj.core.api.Assertions.assertThat;


public class CableCarsTest {

  @Test
  public void numberLines() {
    int actual = CableCars.getNumberLines();
    assertThat(actual).isEqualTo(3);
  }

  @Test
  public void namesOfLines() {
    SoftAssertions softly = new SoftAssertions();
    softly.assertThat(CableCars.isLine("California")).isTrue().as("California");
    softly.assertThat(CableCars.isLine("Powell-Hyde")).isTrue().as("Powell-Hyde");
    softly.assertThat(CableCars.isLine("Powell-Mason")).isTrue().as("Powell-Mason");
    softly.assertThat(CableCars.isLine("San Francisco")).isFalse().as("San Francisco");
    softly.assertAll();
  }
}
