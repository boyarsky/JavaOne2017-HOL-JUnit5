package com.javaone.hol2017.junit5;

import static org.junit.Assert.*;

import org.assertj.core.api.*;
import org.junit.*;

public class CableCarsTest {

	@Test
	public void numberLines() {
		int actual = CableCars.getNumberLines();
		assertEquals(3, actual);
	}
	
	@Test
	public void namesOfLines() {
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(CableCars.isLine("California")).isTrue();
		softly.assertThat(CableCars.isLine("Powell-Hyde")).isTrue();
		softly.assertThat(CableCars.isLine("Powell-Mason")).isTrue();
		softly.assertThat(CableCars.isLine("San Franciso")).isFalse();
		softly.assertAll();
	}

}
