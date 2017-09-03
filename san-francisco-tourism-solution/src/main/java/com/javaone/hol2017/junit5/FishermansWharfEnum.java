package com.javaone.hol2017.junit5;

import java.time.*;

public enum FishermansWharfEnum {
	STORES(22), RESTAURANTS(23), FOOD_CARTS(21);

	private LocalTime closing;

	FishermansWharfEnum(int closingHour) {
		closing = LocalTime.of(closingHour, 0);
	}

	public LocalTime closes() {
		return closing;
	}
}
