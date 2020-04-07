package com.io.reader;

import java.io.File;

public class MockContentFileReader implements Reader {

	@Override
	public String read(File inFile) {
		return "Humpty Dumpty sat on a wall Humpty die";
	}

}
