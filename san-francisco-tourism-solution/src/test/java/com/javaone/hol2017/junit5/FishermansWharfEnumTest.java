package com.javaone.hol2017.junit5;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.time.*;

import org.junit.jupiter.api.*;

public class FishermansWharfEnumTest {

	@Test
	public void allClosingTimesAfter9pm() {
		LocalTime ninePm = LocalTime.of(12 + 9, 0);
		for (FishermansWharfEnum current : FishermansWharfEnum.values()) {
			assertThat(current + " should close after 9pm", current.closes(), greaterThanOrEqualTo(ninePm));
		}
	}

}
