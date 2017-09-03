package com.javaone.hol2017.junit5;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.time.*;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class FishermansWharfEnumParamTest {

	@ParameterizedTest
	@EnumSource(FishermansWharfEnum.class)
	public void allClosingTimesAfter9pm(FishermansWharfEnum current) {
		LocalTime ninePm = LocalTime.of(12 + 9, 0);
		assertThat(current + " should close after 9pm", current.closes(), greaterThanOrEqualTo(ninePm));
	}

}
