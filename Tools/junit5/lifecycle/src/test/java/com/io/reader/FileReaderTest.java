package com.io.reader;

import static com.io.helper.FileHelper.createTempFile;
import static com.io.helper.FileHelper.deleteFile;
import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.io.exception.FileNotFoundException;

public class FileReaderTest {
	static String content;
	static String line;
	static String word;
	static String character;
	static File contentFile;
	static File lineFile;
	static File wordFile;
	static File characterFile;
	FileReader fileReader;

	@BeforeClass
	public static void init() {
		content = "Humpty Dumpty sat on a wall \n Humpty die";
		line = "Good Morning! have a great day...";
		word = "Beautiful";
		character = "I";

		contentFile = createTempFile("content", content);
		lineFile = createTempFile("line", line);
		wordFile = createTempFile("word", word);
		characterFile = createTempFile("character", character);
	}

	@Before
	public void setup() {
		fileReader = new FileReader();
	}

	@Test
	public void testReadWithContent() {
		String actualContent = null;
		actualContent = fileReader.read(contentFile);
		assertEquals(actualContent, content);
	}

	@Test
	public void testReadWithLine() {
		String actualLine = null;
		actualLine = fileReader.read(lineFile);
		assertEquals(actualLine, line);
	}

	@Test
	public void testReadWithWord() {
		String actualWord = null;
		actualWord = fileReader.read(wordFile);
		assertEquals(actualWord, word);
	}

	@Test
	public void testReadWithCharacter() {
		String actualCharater = null;
		actualCharater = fileReader.read(characterFile);
		assertEquals(actualCharater, character);
	}

	@Test(expected = FileNotFoundException.class)
	public void testReadWithNoFile() {
		fileReader.read(new File("d:\\readme.txt"));
	}

	@AfterClass
	public static void cleanUp() {
		deleteFile(contentFile);
		deleteFile(lineFile);
		deleteFile(wordFile);
		deleteFile(characterFile);
	}

	@After
	public void close() {
		fileReader = null;
	}

}
