package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


public class CableCarsTest {
	
	@Test
	public void numberLines() {
		System.out.println("hi");
		int actual = CableCars.getNumberLines();
		assertEquals(3, actual);
	}

	@Test
	public void namesOfLines() {

		assertAll("lines",
				() -> assertTrue(CableCars.isLine("California")),
				() -> assertTrue(CableCars.isLine("Powell-Hyde")),
				() -> assertTrue(CableCars.isLine("Powell-Mason")),
				() -> assertFalse(CableCars.isLine("San Franciso"))

		);
	}

}
