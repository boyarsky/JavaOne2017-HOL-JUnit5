package com.javaone.hol2017.junit5;

import org.junit.Ignore;
import org.junit.Test;

import com.javaone.hol2017.junit5.Earthquake.ShakeException;

import static org.assertj.core.api.Assertions.assertThat;

public class ShakeExceptionTest {

  @Ignore("this test execution has been disabled because it is unnecessary")
  @Test
  public void message() {
    String expected = "message";
    ShakeException actual = new ShakeException(expected);

    assertThat(actual.getMessage()).isEqualTo(expected);
  }
}
