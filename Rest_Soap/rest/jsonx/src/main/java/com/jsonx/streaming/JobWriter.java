package com.jsonx.streaming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.json.Json;
import javax.json.stream.JsonGenerator;

public class JobWriter {
	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os = new FileOutputStream(
				new File("D:\\work\\master\\webservices\\20190417\\rest\\jsonx\\src\\main\\resources\\job.json"));
		JsonGenerator jsonGenerator = Json.createGenerator(os);
		jsonGenerator.writeStartObject();
		jsonGenerator.write("jobNo", UUID.randomUUID().toString());
		jsonGenerator.write("title", "Java Developer");
		jsonGenerator.writeStartObject("company");
		jsonGenerator.write("companyName", "Tata Consultancy Services");
		jsonGenerator.writeEnd();
		jsonGenerator.writeEnd();
		jsonGenerator.close();
	}
}
