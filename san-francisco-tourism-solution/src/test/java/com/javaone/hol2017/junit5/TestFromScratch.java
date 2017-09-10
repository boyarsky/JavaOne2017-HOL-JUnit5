package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;
import java.util.*;
import java.util.stream.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class TestFromScratch {

	@BeforeAll
	static void check() {
		// assumeTrue(System.getProperty("os.name").contains("Windows"));
	}

	@ParameterizedTest
	@MethodSource("primeGenerator")
	void prime(int candidate) {
		assertEquals(1, candidate % 2, "should be odd");
	}

	static IntStream primeGenerator() {
		// no point in sending even numbers to the prime tester
		return IntStream.iterate(5, n -> n + 2)
				.filter(TestFromScratch::isPrime)
				.limit(20);
	}

	static boolean isPrime(int candidate) {
		int max = (int) Math.sqrt(candidate) + 1;
		return IntStream.range(2, max).noneMatch(n -> candidate % n == 0);
	}

	@RepeatedTest(20)
	 void halfSecond() {
		assertTimeout(Duration.ofMillis(500), () -> Thread.sleep(1));
	}
	
	@Test
	@DisplayName("Good job, now go have a \uD83C\uDF7A")
	void print() {
		
	}

}
