package com.javaone.hol2017.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.javaone.hol2017.junit5.Earthquake.*;

public class ShakeExceptionTest {

	@Test @Disabled("this test is ignored becuase it is unnecessary")
	public void message() {
		System.out.println("Do I run?");
		String expected = "message";
		ShakeException actual = new ShakeException(expected);
		assertEquals(expected, actual.getMessage());
	}

}
