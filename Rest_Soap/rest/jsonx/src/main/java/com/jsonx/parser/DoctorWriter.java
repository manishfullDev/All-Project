package com.jsonx.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

public class DoctorWriter {
	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os = new FileOutputStream(
				new File("D:\\work\\master\\webservices\\20190417\\rest\\jsonx\\src\\main\\resources\\doctor.json"));
		JsonWriter jsonWriter = Json.createWriter(os);
		JsonObjectBuilder doctorObjectBuilder = Json.createObjectBuilder();
		JsonObjectBuilder addressObjectBuilder = Json.createObjectBuilder();
		JsonArrayBuilder specializationArrayBuilder = Json.createArrayBuilder();

		specializationArrayBuilder.add("cardio").add("liver");
		addressObjectBuilder.add("addressLine1", "Redwood Street").add("city", "banglore").add("state", "KN")
				.add("zip", 3939).add("country", "India");

		JsonArray specializationArray = specializationArrayBuilder.build();
		JsonObject addressObject = addressObjectBuilder.build();

		doctorObjectBuilder.add("doctorName", "susan").add("gender", "Female").add("experience", 12).add("age", 26)
				.add("qualification", "mbbs").add("specialization", specializationArray).add("address", addressObject);
		JsonObject doctorObject = doctorObjectBuilder.build();

		jsonWriter.write(doctorObject);
		jsonWriter.close();
	}
}
