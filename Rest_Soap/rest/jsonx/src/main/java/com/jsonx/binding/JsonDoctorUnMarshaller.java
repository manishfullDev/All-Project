package com.jsonx.binding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;

public class JsonDoctorUnMarshaller {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream in = null;

		in = new FileInputStream(
				new File("D:\\work\\master\\webservices\\20190417\\rest\\jsonx\\src\\main\\resources\\doctor.json"));
		JsonbBuilder jsonbBuilder = JsonbBuilder.newBuilder();
		jsonbBuilder.withConfig(new JsonbConfig().setProperty(JsonbConfig.FORMATTING, true)
				.setProperty(JsonbConfig.STRICT_IJSON, true));

		Jsonb jsonb = jsonbBuilder.build();

		Doctor doctor = jsonb.fromJson((in), Doctor.class);

		/*
		 * for (String s : doctor.getSpecialization()) { System.out.println(s); }
		 */

		doctor.setAge(60);
		String jsonString = jsonb.toJson(doctor);
		System.out.println(jsonString);

	}
}
