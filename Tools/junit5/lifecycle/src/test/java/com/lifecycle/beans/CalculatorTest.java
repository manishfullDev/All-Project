package com.lifecycle.beans;

import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	int a;
	int b;
	int expectedSum;
	int na;
	int nb;
	int nexpectedSum;
	int pnexpectedSum;
	Calculator calculator;

	@BeforeClass
	public static void init() {
		System.out.println("init()");
	}

	@Before
	public void fixture() {
		System.out.println("fixture()");
		a = 10;
		b = 20;
		na = -10;
		nb = -20;
		pnexpectedSum = 10;
		expectedSum = 30;
		nexpectedSum = -30;
		calculator = new Calculator();
	}

	@Test
	public void testAddWithPositiveNumbers() {
		int actualSum = 0;
		actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@Test
	public void testAddWithNegativeNumbers() {
		int actualSum = 0;
		actualSum = calculator.add(na, nb);
		assertEquals(nexpectedSum, actualSum);
	}

	@Test
	public void testAddWithPositiveNegativeNumbers() {
		int actualSum = 0;
		actualSum = calculator.add(b, na);
		assertEquals(pnexpectedSum, actualSum);
	}

	@After
	public void clean() {
		System.out.println("clean()");
		calculator = null;
	}

	@AfterClass
	public static void shutdown() {
		System.out.println("shutdown()");
	}
}
