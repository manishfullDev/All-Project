package com.ju3.bean;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	private int a;
	private int b;
	private int expectedSum;
	private int na;
	private int nb;
	private int expectedNegSum;
	private Calculator calculator;

	@Override
	protected void setUp() throws Exception {
		a = 10;
		b = 20;
		expectedSum = 40;
		na = -10;
		nb = -20;
		expectedNegSum = -30;
		calculator = new Calculator();
	}

	public void testAddWithPositiveNumbers() {
		int actualSum = 0;
		actualSum = calculator.add(a, b);
		Assert.assertEquals(expectedSum, actualSum);
	}

	public void testAddWithNegativeNumbers() {
		int actualSum = 0;
		actualSum = calculator.add(na, nb);
		Assert.assertEquals(expectedNegSum, actualSum);
	}

	@Override
	protected void tearDown() throws Exception {
		a = 0;
		b = 0;
		expectedSum = 0;
	}

}
