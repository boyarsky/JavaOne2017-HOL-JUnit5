package com.javaone.hol2017.junit5;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.javaone.hol2017.junit5.Earthquake.ShakeException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

public class EarthquakeTest {

  @Rule
  public ExpectedException expected = ExpectedException.none();

  private Earthquake earthquake;

  @Before
  public void setUp() {
    earthquake = new Earthquake();
  }

  @Test(expected = ShakeException.class)
  public void noMessageChecking() {
    earthquake.shake(true);
  }

  @Test
  public void usingRule() {
    expected.expect(Earthquake.ShakeException.class);
    expected.expectMessage("Wait for the aftershock");
    earthquake.shake(true);
  }

  @Test
  public void usingStandalone() {
    try {
      earthquake.shake(true);
      failBecauseExceptionWasNotThrown(Earthquake.ShakeException.class);
    }
    catch (Earthquake.ShakeException e) {
      assertThat(e.getMessage()).contains("Wait for the aftershock");
    }
  }
}
