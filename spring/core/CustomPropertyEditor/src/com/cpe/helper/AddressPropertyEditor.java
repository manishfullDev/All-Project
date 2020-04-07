package com.cpe.helper;

import java.beans.PropertyEditorSupport;

import com.cpe.beans.Address;

public class AddressPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Address address = null;
		String host = null;
		int port = 0;

		host = text.substring(0, text.indexOf(":"));
		port = Integer.parseInt(text.substring(text.indexOf(":") + 1, text.length()));
		address = new Address();
		address.setHost(host);
		address.setPort(port);
		super.setValue(address);
	}

}
