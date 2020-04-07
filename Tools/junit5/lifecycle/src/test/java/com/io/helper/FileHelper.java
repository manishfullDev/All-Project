package com.io.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHelper {
	public static File createTempFile(String prefix, String data) {
		File inFile = null;
		try {
			inFile = File.createTempFile(prefix, ".txt");
			try (FileOutputStream fos = new FileOutputStream(inFile);) {
				fos.write(data.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return inFile;
	}

	public static void deleteFile(File inFile) {
		if (inFile.exists() == true) {
			inFile.delete();
		}
	}
}
