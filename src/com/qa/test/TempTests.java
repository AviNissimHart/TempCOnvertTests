package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.TemperatureConverter;

public class TempTests {

	//TemperatureConverter x = new TemperatureConverter();
	static TemperatureConverter x;
	@BeforeClass
	public static void setup() {
		x = new TemperatureConverter();
	}
	@Test
	public void test1() {
		assertEquals("Expects -203.0", -203.0, x.convertKelvinToCelsius(70));
		//dont worry, nick messed up the code with ints and floats so doesnt work properly
	}
}
