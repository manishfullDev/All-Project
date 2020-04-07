package com.ri.autoparamconversion.resource;

public class Measurement {
	private int feet;
	private int inches;

	/*
	 * public Measurement(String measurement) { String tokens[] = null; tokens =
	 * measurement.split(":"); feet = Integer.parseInt(tokens[0]); inches =
	 * Integer.parseInt(tokens[1]); }
	 */

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	/*
	 * public static Measurement valueOf(String measurement) { String tokens[] =
	 * null; Measurement measurement2 = null;
	 * 
	 * tokens = measurement.split(":"); measurement2 = new Measurement();
	 * measurement2.setFeet(Integer.parseInt(tokens[0]));
	 * measurement2.setInches(Integer.parseInt(tokens[1])); return measurement2; }
	 */
	
	public static Measurement fromString(String measurement) {
		String tokens[] = null;
		Measurement measurement2 = null;

		tokens = measurement.split(":");
		measurement2 = new Measurement();
		measurement2.setFeet(Integer.parseInt(tokens[0]));
		measurement2.setInches(Integer.parseInt(tokens[1]));
		return measurement2;
	}
	
	@Override
	public String toString() {
		return "Measurement [feet=" + feet + ", inches=" + inches + "]";
	}

}















