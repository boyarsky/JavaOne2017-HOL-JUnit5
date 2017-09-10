package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;
import java.util.*;
import java.util.stream.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

@DisplayName("Repeating vs Parameterized")
public class ThirtyNinthAnniversaryEventsRepeatingTest {

	@DisplayName("Repeating tests")
	@RepeatedTest(value=100)
	void tooEarly() {
		Random random = new Random();
		int dayOfYear = random.nextInt(365);
		LocalDate firstOfYear = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate date = firstOfYear.plusDays(dayOfYear);
		assertFalse(ThirtyNinthAnniversaryEvents.isCelebrationDay(date));
	}
	
	@DisplayName("π is fun. Even \uD83D\uDE38 like π.")
	@ParameterizedTest
	@MethodSource("randomDatesIn2016")
	void stillTooEarly(LocalDate date) {
		assertFalse(ThirtyNinthAnniversaryEvents.isCelebrationDay(date));
	}
	
	static List<LocalDate> randomDatesIn2016() {
		Random random = new Random();
		LocalDate firstOfYear = LocalDate.of(2016, Month.JANUARY, 1);
		return IntStream.generate(() -> random.nextInt(365))
				.mapToObj(n -> firstOfYear.plusDays(n))
				.limit(100)
				.collect(Collectors.toList());
	}

}
