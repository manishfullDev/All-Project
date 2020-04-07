package com.don.accessor;

import java.io.IOException;

public interface IAccessor {
	public Object getData() throws IOException;

	public String getKey();

	public void setKey(String key);
}
