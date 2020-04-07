package com.security.invoker;

import java.util.Base64;

public class BasicAuthenticationHelper {
	public static String getBase64EncodedBasicAuthenticationHeader(String username, String password) {
		String authentication = null;
		String unPwd = null;

		unPwd = username + ":" + password;
		authentication = "Basic " + Base64.getEncoder().encodeToString(unPwd.getBytes());

		return authentication;
	}
}
