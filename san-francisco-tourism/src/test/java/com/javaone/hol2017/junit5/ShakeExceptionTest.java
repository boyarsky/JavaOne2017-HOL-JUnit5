package com.javaone.hol2017.junit5;

import static org.junit.Assert.*;

import org.junit.*;

import com.javaone.hol2017.junit5.Earthquake.*;

public class ShakeExceptionTest {

	@Test @Ignore("this test is ignored becuase it is unnecessary")
	public void message() {
		String expected = "message";
		ShakeException actual = new ShakeException(expected);
		assertEquals(expected, actual.getMessage());
	}

}
