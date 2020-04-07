package com.jsonx.parser;

import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class AccountReader {
	public static void main(String[] args) {
		InputStream in = AccountReader.class.getClassLoader().getResourceAsStream("account.json");
		JsonReader reader = Json.createReader(in);
		JsonObject jAccountObject = reader.readObject();

		String accountNo = jAccountObject.getString("accountNo");
		JsonObject jAddressObject = jAccountObject.getJsonObject("address");
		JsonArray jCqs = jAccountObject.getJsonArray("cheque_books");

		System.out.println("accountNo : " + accountNo);
		System.out.println("addressLine1 : " + jAddressObject.getString("addressLine1"));
		for (int i = 0; i < jCqs.size(); i++) {
			System.out.println(jCqs.getString(i));
		}
	}
}
