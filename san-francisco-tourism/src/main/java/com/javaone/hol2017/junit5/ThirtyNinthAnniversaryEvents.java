package com.javaone.hol2017.junit5;

import java.time.*;
import java.util.*;

/**
 * Pier 39 is celebrating it's 39th anniversary with events every Friday for the
 * first 39 weeks of 2017.
 *
 */
public class ThirtyNinthAnniversaryEvents {
	
	private static Set<LocalDate> specialDates = listSpecialDates();

	private ThirtyNinthAnniversaryEvents() {
		super();
	}

	private static Set<LocalDate> listSpecialDates() {
		Set<LocalDate> result = new HashSet<>();
		LocalDate friday = getFirstFriday(2017);
		for (int i = 0; i <= 39; i++) {
			result.add(friday);
			friday = friday.plusWeeks(1);
		}
		result.add(friday);
		return result;
	}

	public static boolean isCelebrationDay(LocalDate date) {
		return specialDates.contains(date);
	}

	private static LocalDate getFirstFriday(int year) {
		LocalDate candidate = LocalDate.of(year, 1, 1);
		while (candidate.getDayOfWeek() != DayOfWeek.FRIDAY) {
			candidate = candidate.plusDays(1);
		}
		return candidate;
	}

}
