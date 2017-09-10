package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.*;

import com.javaone.hol2017.junit5.Earthquake.*;

public class EarthquakeTest {
	private Earthquake earthquake;

	@BeforeEach
	public void setUp() {
		earthquake = new Earthquake();
	}

	@Test
	public void usingStandalone() {
		ShakeException actual = assertThrows(ShakeException.class, () -> earthquake.shake(true));
		assertThat(actual.getMessage(), containsString("Wait for the aftershock"));
	}

}
