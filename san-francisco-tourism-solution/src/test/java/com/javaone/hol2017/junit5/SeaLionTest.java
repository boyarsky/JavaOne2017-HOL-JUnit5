package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/*
 * Clearly this test doesn't cover all the cases, but good enough o show JUnit 5 ;)
 */
public class SeaLionTest {

	private static SeaLion seaLion1;
	private static SeaLion seaLion2;

	@BeforeAll
	public static void createSeaLions() {
		seaLion1 = new SeaLion(1, 75, true);
		seaLion2 = new SeaLion(2, 125, false);
	}

	@AfterAll
	public static void tearDown() {
		seaLion1 = null;
		seaLion2 = null;
	}

	@Test
	public void hashCodeValues() {
		assertEquals(seaLion1.hashCode(), seaLion1.hashCode(), "same");
		assertNotEquals(seaLion1.hashCode(), seaLion2.hashCode(), "different");
	}

	@Test
	public void equalsValues() {
		assertTrue(seaLion1.equals(seaLion1), "same");
		assertFalse(seaLion1.equals(null), "null");
		assertFalse(seaLion1.equals(seaLion2), "different");
	}

}
