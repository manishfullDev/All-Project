package com.io.data;

import static com.io.helper.FileHelper.*;
import static org.junit.Assert.assertEquals;

import java.io.File;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.io.reader.MockContentFileReader;
import com.io.reader.Reader;

public class DictionaryTest {
	String content;
	Dictionary dictionary;
	long expectedWordCount;

	@Before
	public void setup() {
		Reader reader = null;
		reader = EasyMock.mock(Reader.class);
		EasyMock.expect(reader.read(new File("contents.txt"))).andReturn("Humpty Dumpty sat on a wall Humpty die");
		EasyMock.replay(reader);

		dictionary = new Dictionary(reader);
		content = "Humpty Dumpty sat on a wall Humpty die";
		expectedWordCount = 8;
	}

	@Test
	public void testWordCountWithContent() {
		long actualWordCount = 0;
		actualWordCount = dictionary.wordCount(new File("contents.txt"));
		assertEquals(expectedWordCount, actualWordCount);
	}

	@After
	public void tearDown() {
		dictionary = null;
	}

}
