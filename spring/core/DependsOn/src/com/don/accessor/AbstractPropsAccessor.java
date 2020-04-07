package com.don.accessor;

import java.io.IOException;
import java.util.Properties;

abstract public class AbstractPropsAccessor implements IAccessor {
	protected String propsFileName;
	protected String key;

	public AbstractPropsAccessor(String propsFileName) {
		this.propsFileName = propsFileName;
	}

	@Override
	public Object getData() throws IOException {
		Properties props = null;

		props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream(propsFileName));
		return props;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public void setKey(String key) {
		this.key = key;
	}

}
