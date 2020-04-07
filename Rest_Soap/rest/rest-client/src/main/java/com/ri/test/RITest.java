package com.ri.test;

import java.util.Arrays;

import com.ri.invoker.CommercialPropertyServiceInvoker;

public class RITest {
	public static void main(String[] args) {
		CommercialPropertyServiceInvoker invoker = new CommercialPropertyServiceInvoker();
		/*
		 * String complexes = invoker.searchCommercialComplex("Madhapur", 5, "east");
		 * System.out.println(complexes);
		 */
		String matchingComplexes = invoker.searchCommercialComplex("Hyderabad", 2000, 4,
				Arrays.asList(new Integer[] { 3, 5 }), 200,
				Arrays.asList(new String[] { "firesafety", "EmergencyEvacuation" }),
				Arrays.asList(new String[] { "Madhapur", "Kondapur" }), true, "east");
		System.out.println(matchingComplexes);
	}
}
