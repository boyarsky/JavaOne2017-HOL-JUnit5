package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.*;

public class EarthquakeTimeoutTest {

	private Earthquake earthquake;

	@BeforeEach
	public void setUp() {
		earthquake = new Earthquake();
	}

	@Test
	public void timeout() {
		assertTimeout(Duration.ofSeconds(6), () -> earthquake.waitForAftershock());
	}

}
