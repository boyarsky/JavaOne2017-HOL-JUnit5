package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class ThirtyNinthAnniversaryEventsValueSourceTest {

	@ParameterizedTest(name = "{0}")
	@ValueSource(strings= {"2017-01-06", "2017-02-17", "2017-10-06", "2017-10-13"})
	public void specialDates(String formattedDate) {
		LocalDate date = LocalDate.parse(formattedDate);
		boolean actual = ThirtyNinthAnniversaryEvents.isCelebrationDay(date);
		assertTrue(actual);
	}
	
	@ParameterizedTest(name = "{0}")
	@ValueSource(strings= {"2016-12-30", "2017-01-05", "2017-02-16", "2017-10-20"})
	public void notSpecialDates(String formattedDate) {
		LocalDate date = LocalDate.parse(formattedDate);
		boolean actual = ThirtyNinthAnniversaryEvents.isCelebrationDay(date);
		assertFalse(actual);
	}

	@Test
	public void dummyTestSoRuns() {
		// no op
	}

}
