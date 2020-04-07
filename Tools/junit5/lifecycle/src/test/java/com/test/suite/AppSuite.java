package com.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.arrays.beans.ArrayHelperTest;
import com.io.data.DictionaryTest;
import com.io.reader.FileReaderTest;
import com.lifecycle.beans.CalculatorTest;
import com.lifecycle.beans.PCalculatorTest;
import com.palindrome.beans.StringHelperTest;
import com.rb.dao.BusProviderDaoTest;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, PCalculatorTest.class, ArrayHelperTest.class, StringHelperTest.class,
		FileReaderTest.class, DictionaryTest.class, BusProviderDaoTest.class })
public class AppSuite {

}
