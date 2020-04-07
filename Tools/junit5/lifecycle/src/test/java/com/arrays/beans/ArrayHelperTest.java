package com.arrays.beans;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.arrays.exception.EmptyArrayException;

public class ArrayHelperTest {
	int[] in;
	int[] duplicateInArray;
	int[] expectedDuplicateInArray;
	int[] sameInArray;
	int[] twoInArray;
	int[] expectedTwoInArray;
	int[] oneInputArray;
	int[] expectedSortArray;
	ArrayHelper arrayHelper;

	@Before
	public void setup() {
		in = new int[] { 10, 2, 13, 5, 7, 21 };
		duplicateInArray = new int[] { 10, 2, 10, 13, 2, 7, 21, 21, 2, 10, 7 };
		sameInArray = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		twoInArray = new int[] { 10, 1 };
		oneInputArray = new int[] { 10 };

		expectedSortArray = new int[] { 2, 5, 7, 10, 13, 21 };
		expectedDuplicateInArray = new int[] { 2, 2, 2, 7, 7, 10, 10, 10, 13, 21, 21 };
		expectedTwoInArray = new int[] { 1, 10 };

		arrayHelper = new ArrayHelper();
	}

	@Test
	public void testSortArray() {
		int[] actualArray = null;
		actualArray = arrayHelper.sort(in);
		assertArrayEquals(expectedSortArray, actualArray);
	}

	@Test
	public void testDuplicateArray() {
		int[] actualArray = null;
		actualArray = arrayHelper.sort(duplicateInArray);
		assertArrayEquals(expectedDuplicateInArray, actualArray);
	}

	@Test
	public void testSameArray() {
		int[] actualArray = null;
		actualArray = arrayHelper.sort(sameInArray);
		assertArrayEquals(sameInArray, actualArray);
	}

	@Test
	public void testTwoInArray() {
		int[] actualArray = null;
		actualArray = arrayHelper.sort(twoInArray);
		assertArrayEquals(expectedTwoInArray, actualArray);
	}

	@Test
	public void testOneInArray() {
		int[] actualArray = null;
		actualArray = arrayHelper.sort(oneInputArray);
		assertArrayEquals(oneInputArray, actualArray);
	}

	@Test
	public void testNull3Array() {
		int[] actualArray = null;
		try {
			arrayHelper.sort(null);
			assertTrue(false);
		} catch (EmptyArrayException e) {
			assertTrue(true);
		}
	}

	@Test(expected = EmptyArrayException.class)
	public void testNull4Array() {
		arrayHelper.sort(null);
	}

	@After
	public void tearDown() {
		arrayHelper = null;
	}

}
