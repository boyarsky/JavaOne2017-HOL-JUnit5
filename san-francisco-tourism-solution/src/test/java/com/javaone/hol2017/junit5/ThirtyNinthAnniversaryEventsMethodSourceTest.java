package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;
import java.util.*;
import java.util.stream.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class ThirtyNinthAnniversaryEventsMethodSourceTest {

	@ParameterizedTest(name = "{0}")
	@MethodSource("specialDateGenerator")
	public void specialDates(LocalDate date) {
		boolean actual = ThirtyNinthAnniversaryEvents.isCelebrationDay(date);
		assertTrue(actual);
	}

	@ParameterizedTest(name = "{0}")
	@MethodSource("nonSpecialDateGenerator")
	public void notSpecialDates(LocalDate date) {
		boolean actual = ThirtyNinthAnniversaryEvents.isCelebrationDay(date);
		assertFalse(actual);
	}

	public static List<LocalDate> specialDateGenerator() {
		return Arrays.asList(LocalDate.of(2017, 1, 6),
				LocalDate.of(2017, 2, 17),
				LocalDate.of(2017, 10, 6),
				LocalDate.of(2017, 10, 13));
	}

	public static Stream<LocalDate> nonSpecialDateGenerator() {
		return Stream.of(LocalDate.of(2016, 12, 30),
				LocalDate.of(2017, 1, 5),
				LocalDate.of(2017, 2, 16),
				LocalDate.of(2017, 10, 20));
	}

	@Test
	public void dummyTestSoRuns() {
		// no op
	}

}
