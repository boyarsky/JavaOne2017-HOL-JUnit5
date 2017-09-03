package com.javaone.hol2017.junit5;

import static org.junit.Assert.*;

import org.junit.*;

/*
 * Clearly this test doesn't cover all the cases, but good enough o show JUnit 5 ;)
 */
public class SeaLionTest {

	private static SeaLion seaLion1;
	private static SeaLion seaLion2;

	@BeforeClass
	public static void createSeaLions() {
		seaLion1 = new SeaLion(1, 75, true);
		seaLion2 = new SeaLion(2, 125, false);
	}

	@AfterClass
	public static void tearDown() {
		seaLion1 = null;
		seaLion2 = null;
	}

	@Test
	public void hashCodeValues() {
		assertEquals("same", seaLion1.hashCode(), seaLion1.hashCode());
		assertNotEquals("different", seaLion1.hashCode(), seaLion2.hashCode());
	}

	@Test
	public void equalsValues() {
		assertTrue("same", seaLion1.equals(seaLion1));
		assertFalse("null", seaLion1.equals(null));
		assertFalse("different", seaLion1.equals(seaLion2));
	}

}
