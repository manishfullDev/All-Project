package com.jsonx.streaming;

import java.io.InputStream;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class DoctorReader {
	public static void main(String[] args) {
		Event e = null;
		int experience = 0;
		String keyName = null;
		String qualification = null;

		InputStream in = DoctorReader.class.getClassLoader().getResourceAsStream("doctor.json");
		JsonParser parser = Json.createParser(in);
		while (parser.hasNext()) {
			e = parser.next();
			if (e == Event.KEY_NAME) {
				keyName = parser.getString();
			} else if (e == Event.VALUE_STRING) {
				if (keyName.equals("qualification")) {
					qualification = parser.getString();
				}
			} else if (e == Event.VALUE_NUMBER) {
				if (keyName.equals("experience")) {
					experience = parser.getInt();
				}
			}
		}
		System.out.println("experience : " + experience + " qualification : " + qualification);
	}
}
