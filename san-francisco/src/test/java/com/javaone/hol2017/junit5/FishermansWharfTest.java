package com.javaone.hol2017.junit5;

import static org.junit.Assert.*;

import org.junit.*;

public class FishermansWharfTest {

	private FishermansWharf wharf;

	@Before
	public void createWharf() {
		wharf = new FishermansWharf();
	}

	@Test
	public void url() {
		assertEquals("url", "http://www.fishermanswharf.org", wharf.getUrl());
	}

}
