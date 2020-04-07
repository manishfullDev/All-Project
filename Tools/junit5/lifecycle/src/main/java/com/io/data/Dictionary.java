package com.io.data;

import java.io.File;

import com.io.reader.FileReader;
import com.io.reader.Reader;

public class Dictionary {
	private Reader reader;

	public Dictionary(Reader reader) {
		this.reader = reader;
	}

	public long wordCount(File inFile) {
		String data = null;
		int c = 0;

		data = reader.read(inFile);
		c = data.split(" ").length;
		return c;
	}
}
