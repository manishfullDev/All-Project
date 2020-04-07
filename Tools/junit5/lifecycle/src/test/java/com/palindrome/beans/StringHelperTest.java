package com.palindrome.beans;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	String palindrom;
	String notAPalindrome;
	String singleCharInput;
	String twoCharNonPalindromInput;
	String twoCharPalindromInput;
	String noCharInput;
	String nullInput;
	StringHelper stringHelper;

	@Before
	public void setup() {
		palindrom = "madam";
		notAPalindrome = "junit";
		singleCharInput = "j";
		twoCharNonPalindromInput = "ja";
		twoCharPalindromInput = "jj";
		noCharInput = "";
		nullInput = null;

		stringHelper = new StringHelper();
	}

	@Test
	public void testIsPalindrome() {
		boolean actual = false;
		actual = stringHelper.isPalindrome(palindrom);
		assertTrue(actual);
	}

	@Test
	public void testNotPalindrome() {
		boolean actual = false;
		actual = stringHelper.isPalindrome(notAPalindrome);
		assertFalse(actual);
	}

	@Test
	public void testSingleCharInput() {
		boolean actual = false;
		actual = stringHelper.isPalindrome(singleCharInput);
		assertTrue(actual);
	}

	@Test
	public void testTwoCharNonPalindromeInput() {
		boolean actual = false;
		actual = stringHelper.isPalindrome(twoCharNonPalindromInput);
		assertFalse(actual);
	}

	@Test
	public void testTwoCharPalindromeInput() {
		boolean actual = false;
		actual = stringHelper.isPalindrome(twoCharPalindromInput);
		assertTrue(actual);
	}

	@Test
	public void testNoCharInput() {
		boolean actual = false;
		actual = stringHelper.isPalindrome(noCharInput);
		assertFalse(actual);
	}

	@Test
	public void testNullInput() {
		boolean actual = false;
		actual = stringHelper.isPalindrome(nullInput);
		assertFalse(actual);
	}
	
	@After
	public void tearDown() {
		stringHelper = null;
	}
}




















