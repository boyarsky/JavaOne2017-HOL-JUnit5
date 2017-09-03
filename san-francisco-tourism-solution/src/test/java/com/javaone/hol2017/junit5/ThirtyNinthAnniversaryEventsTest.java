package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class ThirtyNinthAnniversaryEventsTest {

	@ParameterizedTest(name = "{0}")
	@CsvFileSource(resources = { "/39-tests.txt" })
	public void date(LocalDate date, boolean expectedResult) {
		boolean actual = ThirtyNinthAnniversaryEvents.isCelebrationDay(date);
		assertEquals(expectedResult, actual);
	}

	@Test
	public void dummyTestSoRuns() {
		// no op
	}

}
