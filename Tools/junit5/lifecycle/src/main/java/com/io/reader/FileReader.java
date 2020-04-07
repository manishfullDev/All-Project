package com.io.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.io.exception.FileAccessException;

public class FileReader implements Reader {
	public String read(File inFile) {
		int c = 0;
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		try (FileInputStream fis = new FileInputStream(inFile);) {
			while ((c = fis.read()) != -1) {
				buffer.append((char) c);
			}
		} catch (FileNotFoundException e) {
			throw new com.io.exception.FileNotFoundException("file not found", e);
		} catch (IOException e) {
			throw new FileAccessException("unable to read the data", e);
		}
		buffer.append(" tmp");
		return buffer.toString();
	}
}
