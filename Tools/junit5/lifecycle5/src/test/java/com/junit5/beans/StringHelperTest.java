package com.junit5.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.junit5.exception.EmptyStringException;
import com.junit5.param.resolver.RandomParameterResolver;

@ExtendWith(RandomParameterResolver.class)
@DisplayName("String Helper")
public class StringHelperTest {
	String in;
	String expectedReverseString;
	StringHelper helper;

	@BeforeEach
	public void setUp() {
		in = "good evening";
		expectedReverseString = "gnineve doog";
		helper = new StringHelper();
	}

	@Nested
	@DisplayName("positive testcases")
	class StringHelperPositiveTests {
		@Test
		@DisplayName("test reverse")
		// @RepeatedTest(10)
		public void testReverse(Random random, TestInfo testInfo, TestReporter testReporter) {
			Map<String, String> info = new HashMap<String, String>();

			String actualReverseString = null;
			// System.out.println(random.nextInt());
			info.put("input", in);
			// System.out.println(repetitionInfo.getCurrentRepetition());
			actualReverseString = helper.reverse(in);
			info.put("actual string", actualReverseString);
			assertEquals(expectedReverseString, actualReverseString);
			testReporter.publishEntry(info);
		}

		@Test
		@DisplayName("test reverse with two chars")
		// @RepeatedTest(10)
		public void testReverseWithTwoChars(Random random, TestInfo testInfo, TestReporter testReporter) {
			Map<String, String> info = new HashMap<String, String>();

			String actualReverseString = null;
			// System.out.println(random.nextInt());
			info.put("input", in);
			// System.out.println(repetitionInfo.getCurrentRepetition());
			actualReverseString = helper.reverse(in);
			info.put("actual string", actualReverseString);
			assertEquals(expectedReverseString, actualReverseString);
			testReporter.publishEntry(info);
		}
	}

	@Nested
	@DisplayName("negative testcases")
	class StringHelperNegativeTests {
		@Test
		@DisplayName("test reverse with empty string")
		@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
		public void testReverse() {
			assertThrows(EmptyStringException.class, () -> {
				helper.reverse("");
			});
		}

		@Test
		@DisplayName("test reverse with null string")
		public void testReverseWithTwoChars() {
			String actualReverseString = null;
			actualReverseString = helper.reverse(null);
			assertEquals(expectedReverseString, actualReverseString);
		}
	}

	@ParameterizedTest
	@CsvSource(value = { "bye,eyb", "apple,elppa", "i,i" })
	public void testReverseWithAllPosibilities(String in, String expectedReverseString) {
		String actualReverseString = null;
		actualReverseString = helper.reverse(in);
		assertEquals(expectedReverseString, actualReverseString);
	}
}
