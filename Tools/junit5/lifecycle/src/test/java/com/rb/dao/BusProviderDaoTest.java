package com.rb.dao;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.rb.bo.BusProviderBo;
import com.rb.dao.helper.DDLHelper;

public class BusProviderDaoTest {
	private int inBusProviderId;
	private BusProviderDao busProviderDao;
	private BusProviderBo expectedBusProviderBo;

	@BeforeClass
	public static void init() throws ClassNotFoundException, IOException, SQLException {
		DDLHelper.sql("db-admin.properties", "create-transport.sql");
	}

	@Before
	public void setUp() throws ClassNotFoundException, IOException, SQLException {
		DDLHelper.sql("db.properties", "insert-bus-providers.sql");
		inBusProviderId = 1;
		expectedBusProviderBo = new BusProviderBo(1, "Kaleswara Travels", new Date(2019, 06, 07), "9383839830",
				"contactus@kaleswara.com", "A");
		busProviderDao = new BusProviderDao();
	}

	@After
	public void tearDown() throws ClassNotFoundException, IOException, SQLException {
		DDLHelper.sql("db.properties", "delete-bus-providers.sql");
	}

	@Test
	@Ignore
	public void testGetBusProviderWithoutProvider() throws ClassNotFoundException, IOException, SQLException {
		BusProviderBo actualBusProviderBo = null;

		actualBusProviderBo = busProviderDao.getBusProvider(15);
		assertEquals(expectedBusProviderBo.getBusinessName(), actualBusProviderBo.getBusinessName());

	}

	@Test(timeout = 10L)
	public void testGetBusProvider() throws ClassNotFoundException, IOException, SQLException {
		BusProviderBo actualBusProviderBo = null;

		actualBusProviderBo = busProviderDao.getBusProvider(inBusProviderId);
		assertEquals(expectedBusProviderBo.getBusinessName(), actualBusProviderBo.getBusinessName());
	}

	@AfterClass
	public static void close() throws ClassNotFoundException, IOException, SQLException {
		DDLHelper.sql("db-admin.properties", "drop-transport.sql");
	}
}
