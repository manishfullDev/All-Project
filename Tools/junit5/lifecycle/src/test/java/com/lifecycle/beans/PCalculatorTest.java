package com.lifecycle.beans;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PCalculatorTest {
	int a;
	int b;
	int expectedSum;
	Calculator calculator;

	@Parameters
	public static Collection<Object[]> getParameters() {
		return Arrays.asList(new Object[][] { { 10, 20, 30 }, { -10, -20, -30 }, { -10, 20, 10 } });
	}

	public PCalculatorTest(int a, int b, int expectedSum) {
		this.a = a;
		this.b = b;
		this.expectedSum = expectedSum;
	}

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		int actualSum = 0;
		actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

}
