package com.junit5.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(Lifecycle.PER_METHOD)
@DisplayName("Calculator Test Case")
public class CalculatorTest {
	int a;
	int b;
	int expectedSum;
	int na;
	int nb;
	int nexpectedSum;
	Calculator calculator;

	@BeforeAll
	public static void init() {
		System.out.println("init()");
	}

	@BeforeEach
	public void setUp() {
		System.out.println("setUp()");
		a = 10;
		b = 20;
		expectedSum = 30;
		na = -10;
		nb = -20;
		nexpectedSum = -30;
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Add With Positive Numbers")
	@Order(value = 1)
	public void testAddWithPositive() {
		int actualSum = 0;
		assumeTrue("DEV".equals(System.getenv("env")));

		actualSum = calculator.add(a, b);
		System.out.println(this.hashCode());
		assertEquals(expectedSum, actualSum);

	}

	@Test
	@DisplayName("Add with Negative Numbers")
	@Tag("negative")
	@Order(value = 2)
	// @EnabledOnOs(OS.LINUX)
	// @EnabledOnJre(JRE.JAVA_9)
	// @EnabledIfSystemProperty(named = "os.name", matches = "window")
	@EnabledIfEnvironmentVariable(named = "env", matches = "DEV")
	public void testAddWithNegative() {
		int actualSum = 0;
		actualSum = calculator.add(na, nb);
		System.out.println(this.hashCode());
		assertEquals(nexpectedSum, actualSum);
	}

	@AfterEach
	public void tearDown() {
		System.out.println("tearDown()");
		calculator = null;
	}

	@AfterAll
	public static void close() {
		System.out.println("close()");
	}
}
