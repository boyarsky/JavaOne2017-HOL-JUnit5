package com.javaone.hol2017.junit5;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.*;
import org.junit.rules.*;

import com.javaone.hol2017.junit5.Earthquake.*;

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
		expected.expect(ShakeException.class);
		expected.expectMessage("Wait for the aftershock");
		earthquake.shake(true);
	}

	@Test
	public void usingStandalone() {
		try {
			earthquake.shake(true);
			fail("should throw exception");
		} catch (ShakeException e) {
			assertThat(e.getMessage(), containsString("Wait for the aftershock"));
		}
	}

}
