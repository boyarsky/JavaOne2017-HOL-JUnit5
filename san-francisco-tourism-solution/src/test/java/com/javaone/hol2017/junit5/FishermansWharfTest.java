package com.javaone.hol2017.junit5;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class FishermansWharfTest {

	private FishermansWharf wharf;

	@BeforeEach
	public void createWharf() {
		wharf = new FishermansWharf();
	}

	@Test
	public void url() {
		assertEquals("http://www.fishermanswharf.org", wharf.getUrl(), "url");
	}
	
	@Test
	public void oldestSeaLionForEmptyList() {
		assertFalse(wharf.getOldestSeaLion().isPresent());
	}
	
	@Test
	public void oldestSeaLionForFirstElement() {
		wharf.addSeaLion(new SeaLion(15, 200, true));
		wharf.addSeaLion(new SeaLion(10, 150, false));
		SeaLion actual = wharf.getOldestSeaLion().get();
		assertEquals(15, actual.getAge());
	}
	
	@Test
	public void oldestSeaLionForLastElement() {
		wharf.addSeaLion(new SeaLion(10, 150, false));
		wharf.addSeaLion(new SeaLion(15, 200, true));
		SeaLion actual = wharf.getOldestSeaLion().get();
		assertEquals(15, actual.getAge(), "oldest");
	}

}
